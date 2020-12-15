import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        double x, y, z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x");
        x = scanner.nextDouble();
        System.out.println("Введите число y");
        y = scanner.nextDouble();
        System.out.println("Введите число z");
        z = scanner.nextDouble();

        double middle = (x + y + z)/3;

        System.out.println("Среднее арифметическое чисел x y и z = " + middle);

        double a = Math.floor(middle/2);

        if (a > 3){
            System.out.println("Программа выполнена корректно");
        }
    }
}
