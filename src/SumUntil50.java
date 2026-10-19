import java.util.Scanner;

/**
 * B2 - Bai 4:
 * Nhap cac so nguyen va tinh tong. Neu tong > 50 thi ket thuc
 * vong lap va hien thi tong cac so da nhap.
 */
public class SumUntil50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (sum <= 50) {
            System.out.print("Nhap so nguyen: ");
            sum += sc.nextInt();
        }

        System.out.println("Tong cac so da nhap: " + sum);
        sc.close();
    }
}
