package main.java.task_3;

public class App {
    public static void main(String[] args) {

        long i1 = 1234560;
        long i2 = 98797410;

        System.out.printf("Before: %d, after: %d\n", i1, changeLastZeroToOne(i1));
        System.out.printf("Before: %d, after: %d\n", i2, changeLastZeroToOne(i2));
    }

    public static long changeLastZeroToOne(long i) {
        return i | (i + 1);
    }
}
