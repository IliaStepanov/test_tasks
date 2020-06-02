package main.java.task_2;

public class App {
    public static void main(String[] args) {

        SimpleChecker simpleChecker = new SimpleChecker();
        simpleChecker.check("([][[]()])");
        simpleChecker.check("([][]()])");
        simpleChecker.check("(awd[dw([])sdf][](fadf[])[21[]awe])");
    }
}
