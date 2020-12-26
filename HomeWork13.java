import java.util.Scanner;

public class HomeWork13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = scanner.nextLine();

        String[] array = string.split(" ");
        int countOfWords = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].matches("[a-zA-Z]+")){
                System.out.println(array[i]);
                countOfWords++;
            }
        }
        System.out.println("Количество слов состоящих из латиницы: " + countOfWords);
    }
}
