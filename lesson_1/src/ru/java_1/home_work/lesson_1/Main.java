package ru.java_1.home_work.lesson_1;

public class Main {

    //Объявление глобальных переменных
    private static int a;
    private static int b;
    private static int c;
    private static int d;
    private static int res;
    private static String name;

    //Задание №1
    public static void main(String[] args) {

        //Выполнение методов
        calculate(); //выполнение 3-го задания
        compare(); //выполнение 4-го задания
        check(); //выполнение 5-го задания
        num(); //выполнение 6-го задания
        name(); //выполнение 7-го задания
        year(); //выполнение 8-го задания

        //Задание №2
        //Объявление Переменных
        byte b1; //8-ми битное целое число
        short s1; //16-ти битное целое число
        int a1; //32-х битное целое число
        long l1; //64-х битное целое число
        float f1; //32-х битное число с плавающей запятой одинарной точности
        double d1; //64-х битное число с плавающей запятой двойной точности
        boolean bool1; // Принимает значение true(правда) или false(лож)
        char c1; //16-битный тип данных, предназначенный для хранения символов в кодировке Unicode
        String str; //строка

        //Инициализация переменных
        b1 = 8;
        s1 = 125;
        a1 = 1;
        l1 = 55L;
        f1 = 15.4f;
        d1 = 75.455;
        bool1 = true;
        c1 = 'a';
        str = "Текст";

    }

    //Задание №3
    public static void calculate() {
        a = 5;
        b = 55;
        c = -45;
        d = 40;
        res = (a * (b + (c / d)));
        System.out.println(res);
        return ;
    }

    //Задание №4
    public static boolean compare() {
        a = 55;
        b = -30;
        res = a + b;
        if ((res >= 10) && (res <= 20)){
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    //Задание №5
    public static void check(){
        a = 0;
        System.out.println(a >= 0 ? "Число положительное" : "Число отрицательное");
        return;
    }

    //Задание №6
    public static boolean num()    {
        d = -5;
        if (d >= 0) {
            System.out.println("false");
            return false;
        } else {
            System.out.println("true");
            return true;
        }
    }

    //Задание №7
    public static void name(){
        name = "Romzess";
        System.out.println("Привет " + name);
        return;
    }

    //Задание №8
    public static void year(){
        d = 364;
        if ((d % 400 == 0) || (d %100 != 0) && (d % 4 == 0) ){
            System.out.println("Високостный год");
            return;
        } else {
            System.out.println("Не високосный год");
            return;
        }
    }
}