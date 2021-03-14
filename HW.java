package ru.junmidsen.pets;

public class HW {
    public static void main(String args[]) {

    /*Задание 2
Суть задания найти сумму всех четных чисел в последовательности Фибоначи, до
определенного индекса "n".
Например:
    Последовательность: 0, 1, 1, 2, 3, 5, 8, 13, 21
    n = 7
    Сумма всех четных до 7го.  равна 2 + 8 = 10. */

        int a = 0;
        int b = 1;
        int n = 7;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int c = a + b;
            if (c % 2 == 0) {
                sum += c;
            }
                a = b;
                b = c;
        }
        System.out.println("Sum = " + sum);
    }
}
