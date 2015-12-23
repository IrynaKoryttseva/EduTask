package array;

/*
 * Найти среднее арифметическое всех элементов массива
 */
public class TaskArray2 {
    int[] number = {20, -15, 28, 95, 10, 10};
    private double average;
    private int sum = 0;
    private int count = 0;

    public void numberAverageArray() {
        System.out.println("task 2");
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        average = (double) sum / number.length;
        System.out.println(average);
    }
}
