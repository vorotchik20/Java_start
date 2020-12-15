import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        double a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a:");
        a = scanner.nextDouble();
        System.out.println("Введите число b:");
        b = scanner.nextDouble();
        System.out.println("Введите один из символов  ‘+’, ‘-’, ‘*’ или ‘/’:");
        String operation = scanner.next();

        switch (operation){
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
        }
    }
}
