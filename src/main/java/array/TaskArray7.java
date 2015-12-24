package array;

import java.util.Arrays;

/*
 * Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
 * Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
 */
public class TaskArray7 {

    private int min =1;
    private int max =10;
    int[] num = new int[8];

    public void createRandomArray(){
        System.out.println("task 7");
        for(int i=0; i<num.length; i++){
            num[i]=(int)(Math.random()*((max-min)+1)+min);
        }
        System.out.println(Arrays.toString(num));
    }

    public void changeOnZero(){
        for(int i=0; i<num.length; i++){
            if(!(i%2==0)){
                num[i]=0;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
