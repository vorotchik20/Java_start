import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        double[] array = new double[size];
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите данные для добавления в массив типа double");
            array[i] = scanner.nextDouble();
            System.out.println(array[i]);
            sum = sum + array[i];
        }
        double average = sum / array.length;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]*average);
        }
    }
}
