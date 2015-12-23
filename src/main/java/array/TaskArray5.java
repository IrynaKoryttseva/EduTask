package array;

/*
 * Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
 * Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */

        import java.util.Arrays;

public class TaskArray5 {

    int[] pilot = new int[4];
    private int minRange = 10;
    private int maxRange = 99;
    private int count = 0;

    public void createArray() {
        System.out.println("task 5");
        for (int i = 0; i < pilot.length; i++) {
            pilot[i] = (int) (Math.random() * ((maxRange - minRange) + 1) + minRange);
        }
        System.out.println(Arrays.toString(pilot));
    }

    public void checkArray() {
        for (int i = 0; i < pilot.length; i++) {
            try {
                if (pilot[i] < pilot[i + 1]) {
                    count = count + 1;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
        }
        switch (count) {
            case 1:
            case 2: {
                System.out.println("Array is not ascending");
                break;
            }
            case 3: {
                System.out.println("Array is ascending");
            }
        }
    }
}
