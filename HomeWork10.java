import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int rows = scanner.nextInt();
        System.out.println("Введите количество столбцов:");
        int columns = scanner.nextInt();
        int[][] matrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Каким значением заполнить в " + i + "-й строке " + j + "-ую ячейку?");
                matrix[j][i] = scanner.nextInt();
            }
            System.out.println("");
        }

        for (int j = 0; j < columns; j++) {
            System.out.print(matrix[j][0]*3 + " ");
        }
    }
}
