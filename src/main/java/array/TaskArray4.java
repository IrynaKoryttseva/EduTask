package array;

/*
 * Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент является в этом массиве
 * максимальным и сообщите индекс его последнего вхождения в массив.
 */

import java.util.Arrays;

public class TaskArray4 {
    int[] mas = new int[12];
    private int min = -15;
    private int max = 15;
    private int maxValue = mas[0];
    private int indexMaxValue;
    private int indexTemp;

    public void createMas(){
        System.out.println("task 4");
        for(int i=0; i<mas.length;i++){
          mas[i]= (int)(Math.random()*(max - min+1))+ min;
        }
        System.out.println(Arrays.toString(mas));
  }

    public void findMaxValueAndIndex() {
        for (int i = 0; i < mas.length; i++) {
            if (maxValue < mas[i]) {
                maxValue = mas[i];
                indexMaxValue = i;
        }

    }
        for (int j = 0; j < mas.length; j++) {
            if (maxValue == mas[j]) {
                indexTemp = j;
                if (indexMaxValue < indexTemp) {
                    indexMaxValue = indexTemp;
                    maxValue = mas[indexMaxValue];
                }
            }

        }
        System.out.println("max value: " + maxValue + " and index " + indexMaxValue);
    }
}



