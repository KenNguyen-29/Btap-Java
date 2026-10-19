package b2;

import java.util.Scanner;

/**
 * B2 - Mang:
 * 1) Nhap n phan tu, in mang va tong
 * 2) Tim chi so cua 1 so
 * 3) Tim phan tu lon nhat
 * 4) Cong cac so cho den khi tong > 50
 */
public class ArrayExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Bai 1: In mang va tong ===");
        int[] arr = inputArray(sc);
        printArray(arr);
        System.out.println("Tong: " + sumArray(arr));

        System.out.println("\n=== Bai 2: Tim chi so ===");
        System.out.print("Nhap so can tim: ");
        int target = sc.nextInt();
        int index = findIndex(arr, target);
        if (index >= 0) {
            System.out.println("Chi so cua " + target + " la: " + index);
        } else {
            System.out.println("Khong tim thay " + target + " trong mang");
        }

        System.out.println("\n=== Bai 3: Phan tu lon nhat ===");
        System.out.println("Max: " + findMax(arr));

        System.out.println("\n=== Bai 4: Tong den khi > 50 ===");
        sumUntilOver50(sc);

        sc.close();
    }

    public static int[] inputArray(Scanner sc) {
        System.out.print("Nhap so phan tu n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.print("Mang: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static void sumUntilOver50(Scanner sc) {
        int sum = 0;
        while (sum <= 50) {
            System.out.print("Nhap so nguyen: ");
            sum += sc.nextInt();
        }
        System.out.println("Tong cac so da nhap: " + sum + " (da > 50)");
    }
}
