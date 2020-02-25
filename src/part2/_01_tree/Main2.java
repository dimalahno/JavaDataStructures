package part2._01_tree;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(recFactorial(4));
    }

    public static int factorial(int n) {
        var factorial = 1;
        for (int i = n; i > 1 ; i--) {
            factorial *= i;
        }
        return factorial;
    }

    // f(3)
    //   3 * f(2)
    //         2 * f(1)
    //               1 * f(0)
    // Use stack of java memory
    public static int recFactorial(int n) {
        // Base condition
        if(n == 0) return 1;
        return n * recFactorial(n - 1);
    }
}
