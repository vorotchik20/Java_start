import java.util.Scanner;

public class HomeWork12 {
    public static void main(String[] args) {
        String string = "I like Java!!!";
        checkString(string);
    }
    public static void checkString(String string){
        if (string.contains("Java") && string.startsWith("I like") && string.endsWith("!!!")){
            System.out.println(string.replaceAll("a", "o").substring(7, 11));
        }else {
            System.out.println("Введите \"I like Java!!!\"");
        }
    }
}
