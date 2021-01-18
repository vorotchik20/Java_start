import java.util.Scanner;

public class FinalWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает, что это? Всего три попытки ответа, на первой попытке введите слово Подсказка чтобы получить подсказку.");

        String response;
        for (int i = 0; i <= 2; i++) {
            System.out.println("Попытка номер " + (i+1));
            response = scanner.nextLine();
            if (response.equals("Подсказка")){
                if (i == 0){
                    System.out.println("Подсказка: Заархивированный...");
                }else {
                    System.out.println("Подсказка уже недоступна");
                }
            }else if (response.equals("Заархивированный вирус")){
                System.out.println("Правильно!");
                return;
            }else{
                if (i == 0 || i == 1){
                    System.out.println("Подумай еще");
                }else {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
        }
    }
}
