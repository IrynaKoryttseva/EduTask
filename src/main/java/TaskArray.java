
import java.util.Arrays;

public class TaskArray {
    int[] number = {75, 0, -4, 23, 10};
    private int indexMin;
    private int indexMax;
    private int min = number[0];
    private int max = number[0];

    public void findIndexMinAndMax() {
        System.out.println("task 0");
        for (int i = 0; i < number.length; i++) {
            if (min > number[i]) {
                min = number[i];
                indexMin = i;
            }
            if (max < number[i]) {
                max = number[i];
                indexMax = i;
            }
        }
        System.out.println(Arrays.toString(number));
        System.out.println("index min " + indexMin);
        System.out.println("index max " + indexMax);
    }

    public void swapMinAndMax() {
        for (int i = 0; i < number.length; i++) {
            int temp = number[indexMax];
            number[indexMax] = number[indexMin];
            number[indexMin] = temp;
        }
        System.out.println(Arrays.toString(number));
    }
}
