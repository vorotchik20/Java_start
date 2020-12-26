import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        String first = scanner.next();
        System.out.println("Введите второе число:");
        int second = scanner.nextInt();
        System.out.println("Наибольшее число: " + Math.max(Integer.parseInt(first), second));
        System.out.println("Наименьшее число: " + (double) Math.min(Integer.parseInt(first), second));
    }
}
