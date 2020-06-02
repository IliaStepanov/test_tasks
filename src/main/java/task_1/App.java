package main.java.task_1;

public class App {
    public static void main(String[] args) {
        int[] array = new int[]{0, 0, 1, 1, 2, 3, 4, 4, 5, 5, 5, 44, 55, 9, 2, 1, 7, 7, 6, 4, 1, 2, 44, 2, 2, 2};


        ArrayEntryCounter arrayEntryCounter = new ArrayEntryCounter();
        System.out.println(arrayEntryCounter.count(array));

    }
}
