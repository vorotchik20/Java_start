import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("Введите число:");
            num = scanner.nextInt();
        }while (num <= 0);
        
        int i = 1;
        int sum = 0;
        while (i <= num){
            sum = sum + i;
            System.out.println(sum);
            i = i+2;
        }
    }
}
