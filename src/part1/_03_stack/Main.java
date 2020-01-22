package part1._03_stack;

public class Main {
    public static void main(String[] args) {
/*        String str = "abcd";

        StringReverser reverser = new StringReverser();
        var result = reverser.reverse(str);
        System.out.println(result);*/

/*        String str = "}1+2{";
        Expression expression = new Expression();
        var isResult = expression.isBalanced(str);
        System.out.println(isResult);*/

        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.toString());
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.toString());

    }
}
