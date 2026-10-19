package b2;

import java.util.Scanner;

/**
 * B2 - Bai tap cuoi:
 * 1) Tong mang
 * 2) Mang tong cua 2 mang
 * 3) Nhap mang bang 1 chuoi "3 4 5 ...", in so phan tu va tong
 */
public class ArrayAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Bai 1: Tong mang ===");
        int[] a = inputArray(sc);
        System.out.println("Tong: " + sum(a));

        System.out.println("\n=== Bai 2: Mang tong 2 mang ===");
        System.out.println("Nhap mang thu 2:");
        int[] b = inputArray(sc);
        int[] total = sumArrays(a, b);
        System.out.print("Mang tong: ");
        for (int v : total) {
            System.out.print(v + " ");
        }
        System.out.println();

        System.out.println("\n=== Bai 3: Nhap mang bang chuoi ===");
        sc.nextLine(); // clear buffer
        System.out.print("Nhap day so cach nhau boi dau cach: ");
        String line = sc.nextLine().trim();
        String[] parts = line.split("\\s+");
        int sum = 0;
        for (String p : parts) {
            sum += Integer.parseInt(p);
        }
        System.out.println("So phan tu: " + parts.length + "; Tong: " + sum);

        sc.close();
    }

    public static int[] inputArray(Scanner sc) {
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int v : arr) {
            s += v;
        }
        return s;
    }

    /** Moi phan tu = tong 2 phan tu tuong ung; do dai = mang dai hon */
    public static int[] sumArrays(int[] a, int[] b) {
        int len = Math.max(a.length, b.length);
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            int x = i < a.length ? a[i] : 0;
            int y = i < b.length ? b[i] : 0;
            result[i] = x + y;
        }
        return result;
    }
}
