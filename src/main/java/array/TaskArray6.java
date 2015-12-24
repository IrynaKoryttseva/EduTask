package array;

import java.util.Arrays;

/*
 * Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран. Подсчитайте сколько в массиве
 * чётных элементов и выведете это количество на экран в отдельной строке.
 */
public class TaskArray6 {
    private int[] num = new int[15];
    private int min = 0;
    private int max = 9;
    private int count = 0;

    public void createRandomArray() {
        System.out.println("task 6");
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        System.out.println(Arrays.toString(num));
    }

    public void findTheEvenElements() {
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                count = count + 1;
            }
        }
        System.out.println("the event elements = " + count);
    }
}
