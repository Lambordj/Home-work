/**Klysheiko Roman*/
package ru.java_1.home_work.lesson_2;

public class Main {

    public static void main(String[] args) {


    }

    /**
     * Задание 1
     * Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    private static void changeMassValue() {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (mass[i] == 1) ? 0 : 1;
        }
    }

        /**
         * Задание 2
         * Задать пустой целочисленный массив размером 8.
         * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
         */
    private static void massFill(){
            int[] mass = new int[8];
            for (int i = 0; i < mass.length; i++) {
                mass[i] = i * 3;
            }
        }

        /**
         * Задание 3
         * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
         * пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */
    private static void MultiplyNumLess6() {
            int mass[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < mass.length; i++) {
                if (mass[i] < 6)
                    mass[i] *= 2;
            }
        }

        /**
         * Задание 4
         * Создать квадратный двумерный целочисленный массив (количество строк и столбцов
         * одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
         */
    private static void quadMass(int[][] mass) {
            int ver, hor;
            for ( ver = 0, hor = mass.length - 1; ver < mass.length; ver++, hor--){
                mass[ver][hor] = 1;
                mass[ver][hor] = 1;
                }
        }


        /**
         * Задание 5
         * Задать одномерный массив и найти в нем минимальный и максимальный
         * элементы (без помощи интернета);
         */
    private static void minMax(int[] mass){
            int max = 5;
            int min = 2;
            for (int i = 1; i < mass.length; i++){
                if (mass[i] > max){
                    max = mass[i];
                }else if (mass[i]< min){
                    min = mass[i];
                }
            }
    }

        /**
         * Задание 6
         * Написать метод, в который передается не пустой одномерный целочисленный массив,
         * метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части
         * массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance
         * ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true,
         * граница показана символами ||, эти символы в массив не входят
         */
    private static boolean checkBalance ( int[] array){
            int length = array.length;
            int leftSum;
            int rightSum;

            for (int i = 0; i < length - 1; i++) {
                leftSum = 0;
                rightSum = 0;

                for (int j = 0; j <= i; j++) {
                    leftSum += array[j];
                }

                for (int k = i + 1; k < length; k++) {
                    rightSum += array[k];
                }

                if (leftSum == rightSum) return true;
            }
            return false;
        }

        /**
         * Задание 7
         * Написать метод, которому на вход подается одномерный массив и число n (может быть
         * положительным, или отрицательным), при этом метод должен сместить все элементы
         * массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными
         * массивами.
         */
    private static int[] massNOffset ( int[] mass, int n){

            if (n < 0) {
                negativeMassNOffset(mass, n);
            } else {
                positiveMassNOffset(mass, n);
            }
            return mass;
        }

    private static int[] negativeMassNOffset ( int[] mass, int n){
            int length = mass.length;
            int current;
            int next;
            n *= -1;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < length - 1; j++) {
                    current = mass[j];
                    next = j + 1;
                if (j + 1 > length - 1) {
                        next = 0;
                    }
                    mass[j] = mass[next];
                    mass[next] = current;
                }
            }
            return mass;
        }

    private static int[] positiveMassNOffset ( int[] mass, int n){
            int length = mass.length - 1;
            int current;
            int prev;

            for (int i = 0; i < n; i++) {
                for (int j = length; 0 <= j; j--) {
                    current = mass[j];
                    prev = j - 1;
                if (j - 1 < 0) {
                        prev = 0;
                    }
                    mass[j] = mass[prev];
                    mass[prev] = current;
                }
            }
            return mass;
        }
}