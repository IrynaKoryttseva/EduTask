package array;

/*
 * Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку. Определите какой
 * элемент встречается в массиве чаще всего и выведите об этом сообщение на экран. Если два каких-то элемента
 * встречаются одинаковое количество раз, то не выводите ничего.
 *
 */

import java.util.Arrays;

public class TaskArray8 {

    private int min = -1;
    private int max = 1;
    int[] num = new int[11];
    private int countA = 0;
    private int countB = 0;
    private int countC = 0;

    public void createRandomArray() {
        System.out.println("task 8");
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        System.out.println(Arrays.toString(num));
    }

    public void findDuplicate() {
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                countA = countA + 1;
            }
            if (num[i] == 0) {
                countB = countB + 1;
            }
            if (num[i] > 0) {
                countC = countC + 1;
            }
            if (i == num.length - 1) {
                if (countA > countB && countA > countC) {
                    System.out.println("elm -1 count = " + countA);
                }
                if (countB > countA && countB > countC) {
                    System.out.println("elm 0 count = " + countB);
                }
                if (countC > countA && countC > countB) {
                    System.out.println("elm 1 count = " + countB);
                }
            }
        }
    }
}

