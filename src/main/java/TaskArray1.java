
import java.util.Arrays;

/*
 Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку,
 разделяя запятой.
 */
public class TaskArray1 {
    int[] num = new int[10];
    private int firstElement = 1;

    public void createArrayAndPrint() {
        System.out.println("task 1");
        for (int i = 0; i < num.length; i++) {
            num[i] = firstElement;
            firstElement = firstElement + 2;
        }
        System.out.println(Arrays.toString(num));
    }
}
