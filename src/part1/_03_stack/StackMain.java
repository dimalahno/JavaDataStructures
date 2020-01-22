package part1._03_stack;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        var top = stack.pop();
        System.out.println(top);
        System.out.println(stack);
        top = stack.peek();
        System.out.println(top);
        System.out.println(stack);
        stack.search(10);
    }
}
