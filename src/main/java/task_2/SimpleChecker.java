package main.java.task_2;

import java.util.Stack;

public class SimpleChecker {

    public void check(String input) {

        boolean flag = true;

        Stack<Object> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);

            switch (character) {

                case '[':
                case '(':
                    stack.addElement(character);
                    break;
                case ']':
                    if (stack.peek().equals('[')) {
                        stack.pop();
                    } else {
                        flag = false;
                    }
                    break;
                case ')':
                    if (stack.peek().equals('(')) {
                        stack.pop();
                    } else {
                        flag = false;
                    }
            }
        }
        if (flag) {
            System.out.println(input + "  expression is valid");
        } else {
            System.out.println(input + "  expression is invalid");
        }
    }
}
