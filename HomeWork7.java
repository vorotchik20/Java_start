import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 3;
        int y = 7;
        int z = 222;

        System.out.println("Укажите размер массива");
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число которое нужно добавить в массив");
            array[i] = scanner.nextInt();
        }

        for (int j : array) {
            if (j == x || j == y || j == z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}
