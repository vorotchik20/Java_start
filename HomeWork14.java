import java.util.Random;

public class HomeWork14 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        int max = 0;
        int min = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 20;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }

        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение по модулю: " + Math.max(Math.abs(max), Math.abs(min)));
    }
}
