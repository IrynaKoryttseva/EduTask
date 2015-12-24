package array;

import java.util.Arrays;

/*
 * Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в двух отдельных
 * строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение
 * оказалось больше (либо сообщите, что их средние арифметические равны).
 */

public class TaskArray10 {

    int[] first=new int[5];
    int[] second=new int[5];
    private int min=0;
    private int max=5;
    private double avgFirst=0;
    private double avgSecond=0;
    private int sum=0;

    public void createFirstArray(){
        System.out.println("task 10");
        for(int i = 0; i<first.length; i++){
            first[i]=(int)(Math.random()*(max-min+1))+min;
        }
        System.out.println(Arrays.toString(first));
    }

    public void createSecondArray(){
        for(int j=0; j<second.length; j++){
            second[j]=(int)(Math.random()*(max-min+1))+min;
        }
        System.out.println(Arrays.toString(second));
    }

    public void findAverage(){
        for(int i=0; i<first.length; i++){
            try{
            sum=first[i]+first[i+1];
            }catch(ArrayIndexOutOfBoundsException e){}
        }
        avgFirst=(double)sum/first.length;
        for(int j=0; j<second.length;j++){
            try{
                sum=second[j]+second[j+1];
            }catch(ArrayIndexOutOfBoundsException e){}
        }
        avgSecond=(double)sum/second.length;
        if(avgFirst>avgSecond){
            System.out.println("the average value of the first array is bigger than second array ");
        }
        if (avgSecond > avgFirst) {
            System.out.println("the average value of the second array is bigger than first array ");
        }
        else if(avgFirst==avgSecond){
            System.out.println("average of the arrays is equal" );
        }
    }

}
