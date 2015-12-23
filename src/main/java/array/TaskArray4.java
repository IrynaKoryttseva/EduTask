package array;

import java.util.Arrays;

/*
 * Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент является в этом массиве
 * максимальным и сообщите индекс его последнего вхождения в массив.
 */

public class TaskArray4 {
    int[] mas = new int[12];
    int minRange=-15;
    int maxRange=15;
    int maxValue=mas[0];
    int indexMaxValue;

    public void createMas(){
        System.out.println("task 4");
        for(int i=0; i<mas.length;i++){
          mas[i]= (int) ((Math.random()*((maxRange-minRange)+1))+minRange);
        }
        System.out.println(Arrays.toString(mas));
    }

    public void findMaxValueAndIndex(){
        for(int i=0; i<mas.length;i++){
            if(maxValue<mas[i]){
                maxValue=mas[i];
                indexMaxValue=i;
            }
        }
        System.out.println("max value: "+maxValue+" and index "+indexMaxValue);
    }
}
