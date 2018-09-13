package ru.java_1.home_work.lesson_3;

import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Хотите съиграть? Если Да - 1, если Нет - 0");

        switch (scan.nextInt()) {
            case 1:
                randomNum();
            case 0:
            System.out.println("Ну до следующего раза");
            return;
        }
    }


    /**1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
     * При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
     * После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */

    private static void randomNum(){
        System.out.println("угадайте число от 0 до 9");
        int count = 3;
        int input_num = 0;
        int num = (int) (Math.random() * 9);
        while (count > 0) {
            input_num = scan.nextInt();
            if (input_num == num) {
                System.out.println("Вы угадали!");
                break;
            } else if (input_num > num) {
                System.out.println("Загаданное число меньше.");
                System.out.println("Осталось попыток " + (count -= 1));
            } else {
                System.out.println("Загаданное число больше.");
                System.out.println("Осталось попыток " + (count -= 1));
            }
        }
            if (count == 0 || input_num == num) {
                System.out.println("Хотите съиграть снова? Если Да - 1, если Нет - 0");
               while (scan.nextInt() == 1){
                   randomNum();
               };
        }
    }
}
