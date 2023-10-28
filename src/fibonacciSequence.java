public class fibonacciSequence {

    public static void main(String[] args) {
        fibonacci(0, 1, 10);
    }

    public static void fibonacci(int a, int b, int n) {
        int c;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
