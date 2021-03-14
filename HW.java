package ru.junmidsen.pets;

public class HW {
    public static void main(String args[]) {

    /*Есть некоторый массив, состоящий из целых чисел, также есть некоторое число
"n". Суть задания посчитать сумму всех элементов массива, однако если в массиве
    встречается число "n" то в сумму его включать не нужно.*/
        int n = 9;
        int [] array = {1, 5, 8, 9};
        int sum = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 9) {
                    continue;
                }
                sum += array[i];
            }
            System.out.println("Sum =" + sum);

    }
}
