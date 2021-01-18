import java.util.Scanner;

public class FinalWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int countOfStrings = scanner.nextInt();
        String[] strings = new String[countOfStrings];
        String stringWithMaxCountUniqueChars = "";

        for (int i = 0; i < strings.length; i++) {
            System.out.println("Введите строку " + (i+1) + ":");
            strings[i] = scanner.next();
        }

        for (int i = 0; i < strings.length; i++) {
            if (countUniqueChars(stringWithMaxCountUniqueChars) < countUniqueChars(strings[i])){
                stringWithMaxCountUniqueChars = strings[i];
            }
        }
        System.out.println(stringWithMaxCountUniqueChars);
    }
    public static int countUniqueChars(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            if (!result.contains(String.valueOf(string.charAt(i)))) {
                result += string.charAt(i);
            }
        }
        return result.length();
    }
}
