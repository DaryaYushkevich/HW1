package ru.junmidsen.pets;

public class HW {
    public static void main(String args[]) {
       /* Задание 3
        Дан некоторый массив, суть задания инвертировать его. */

        int [] array = {5, 6, 7, 8, 9};
        int[] array2 = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            array2[(array.length - 1) - i] = array[i];
            int inv = array[i];}

            for (int i = 0; i < array2.length; i++) {
                System.out.print(array2[i] + ", ");
        }
    }
}
