package array;

public class Runner {

    public static void main(String[]arg){
        TaskArray taskArray =new TaskArray();
        taskArray.findIndexMinAndMax();
        taskArray.swapMinAndMax();

        TaskArray1 taskArray1=new TaskArray1();
        taskArray1.createArrayAndPrint();

        TaskArray2 taskArray2=new TaskArray2();
        taskArray2.numberAverageArray();

        TaskArray4 taskArray4 = new TaskArray4();
        taskArray4.createMas();
        taskArray4.findMaxValueAndIndex();
    }
}