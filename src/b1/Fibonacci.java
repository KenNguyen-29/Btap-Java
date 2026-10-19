package b1;

/**
 * B1 - Bai tap 2:
 * In ra 20 so dau tien cua day Fibonacci.
 */
public class Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        long a = 0;
        long b = 1;

        System.out.println("20 so Fibonacci dau tien:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a);
            if (i < n) {
                System.out.print(", ");
            }
            long next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
