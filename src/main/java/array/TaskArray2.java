package array;

/*
Найти среднее арифметическое всех элементов массива
 */
public class TaskArray2 {
    int[] number = {20, -15, 28, 95, 10, 10};
    double average;
    int sum = 0;
    int count = 0;

    public void numberAverageArray() {
        System.out.println("task 2");
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
            count = count + 1;
        }
        average = (double) sum / count;
        System.out.println(average);
    }
}
