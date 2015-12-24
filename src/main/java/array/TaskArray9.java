package array;

import java.util.Arrays;

/*
 *  Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем, что первый и второй члены
 *  последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
 */
public class TaskArray9 {

    int[] num= new int[20];


    public void createArrayFibonachi(){
        System.out.println("task 9");
        num[0]=0;
        num[1]=1;
    for(int i=0; i<num.length; i++){
        try{
         num[i+2]=num[i]+num[i+1];
        }catch(ArrayIndexOutOfBoundsException e){ }
    }
        System.out.println(Arrays.toString(num));
    }
}
