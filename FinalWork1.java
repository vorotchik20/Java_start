import java.text.DecimalFormat;
import java.util.Scanner;

public class FinalWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите курс доллара:");
        double course = scanner.nextDouble();
        System.out.println("Введите количество рублей для перевода:");
        double count = scanner.nextDouble();

        DecimalFormat df = new DecimalFormat( "#.##" );

        String sum = df.format(count/course);
        System.out.println("Итого: " + sum + " долларов");
    }
}
