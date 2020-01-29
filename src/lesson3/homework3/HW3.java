package lesson3.homework3;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int) ( Math.random() * 10 );
        do {
            System.out.println("Угдай число с 3 попыток от 0 до 9");
            for (int i = 3; i > 0; i--) {
                System.out.println("Введи свой ответ");
                int questionNum = scanner.nextInt();
                if (questionNum == number) {
                    System.out.println("Вы угадали число, молодец!");
                    break;
                }
                System.out.println(questionNum > number ? "Введенное чилсо больше " : "Введенное число меньше ");
                System.out.println(( i - 1 ) > 0 ? " у вас осталось " + ( i - 1 ) + " попыток." : "Попытки закончились, вы проиграли.");
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
        } while (scanner.nextInt() == 1);
    }
}