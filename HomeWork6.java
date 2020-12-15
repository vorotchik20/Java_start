import java.text.DecimalFormat;
import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        String metres = null;
        String milles = null;
        String yards = null;
        String futs = null;
        String gramms = null;
        String kilogramms = null;
        String centners = null;
        String funts = null;
        int units;
        double count;
        DecimalFormat df = new DecimalFormat( "#.###" );
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить\n[1] - Масса\n[2] - Расстояние");

        switch (scanner.nextInt()){
            case 1:
                System.out.println("Выберите единицу измерения\n[1] - Грамм\n[2] - Килограмм\n[3] - Центнер\n[4] - Фунт");
                units = scanner.nextInt();
                System.out.println("Введите число:");
                count = scanner.nextDouble();
                switch (units){
                    case 1:
                        gramms = df.format(count);
                        kilogramms = df.format(count * 0.001);
                        centners = df.format(count * 0.00001);
                        funts = df.format(count * 0.0022);
                        break;
                    case 2:
                        kilogramms = df.format(count);
                        gramms = df.format(count * 1000);
                        centners = df.format(count * 0.01);
                        funts = df.format(count * 2.205);
                        break;
                    case 3:
                        centners = df.format(count);
                        gramms = df.format(count * 100000);
                        kilogramms = df.format(count * 100);
                        funts = df.format(count * 220.462);
                        break;
                    case 4:
                        funts = df.format(count);
                        gramms = df.format(count * 453.59);
                        kilogramms = df.format(count * 0.454);
                        centners = df.format(count * 0.0045);
                        break;
                }
                System.out.println("Результат:\nГраммы: " + gramms + "\nКилограммы: " + kilogramms + "\nЦентнеры: " + centners + "\nФунты: " + funts);
                break;
            case 2:
                System.out.println("Выберите единицу измерения\n[1] - Метр\n[2] - Миля\n[3] - Ярд\n[4] - Фут");
                units = scanner.nextInt();
                System.out.println("Введите число:");
                count = scanner.nextDouble();
                switch (units){
                    case 1:
                        metres = df.format(count);
                        milles = df.format(count * 0.00062);
                        yards = df.format(count * 1.094);
                        futs = df.format(count * 3.28);
                        break;
                    case 2:
                        milles = df.format(count);
                        metres = df.format(count * 1609.34);
                        yards = df.format(count * 1760);
                        futs = df.format(count * 5280);
                        break;
                    case 3:
                        yards = df.format(count);
                        metres = df.format(count * 0.9144);
                        milles = df.format(count * 0.00057);
                        futs = df.format(count * 3);
                        break;
                    case 4:
                        futs = df.format(count);
                        metres = df.format(count * 0.3);
                        milles = df.format(count * 0.00019);
                        yards = df.format(count * 0.33);
                        break;
                }
                System.out.println("Результат:\nМетры: " + metres + "\nМили: " + milles + "\nЯрды: " + yards + "\nФуты: " + futs);
                break;
        }
    }
}
