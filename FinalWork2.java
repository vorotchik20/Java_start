import java.util.Scanner;

public class FinalWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите простое уравнение, например 5+x=10");
        char[] equation = scanner.next().toCharArray();
        int result = 0;

        if ((equation[1] == '+' || equation[1] == '-') && equation[3] == '='){
            switch (findXPosition(equation)){
                case 0:
                    if (equation[1] == '+'){
                        result = equation[4] - equation[2];
                    }else {
                        result = equation[4] + equation[2];
                    }
                    break;
                case 2:
                    if (equation[1] == '+'){
                        result = equation[4] - equation[0];
                    }else {
                        result = equation[0] - equation[4];
                    }
                    break;
                case 4:
                    if (equation[1] == '+'){
                        result = equation[0] + equation[2];
                    }else {
                        result = equation[0] - equation[2];
                    }
                    break;
                default:
                    System.out.println("x должен быть на 1, 3 или 5 месте в уравнении.");
                    break;
            }
            System.out.println("x = " + result);
        }else{
            System.out.println("Надо вводить простое уравнение, например 5+x=10");
        }
    }

    private static int findXPosition(char[] equation) {
        int result = 0;
        for (int i = 0; i < equation.length; i++) {
            if (equation[i] == 'x'){
                result = i;
            }
        }
        return result;
    }
}
