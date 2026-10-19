package b2;

import java.util.Scanner;

/**
 * B2 - Scanner:
 * Nhap so nguyen trong [0, 100]. Neu sai thi nhap lai cho den khi dung.
 */
public class ValidateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("Nhap so nguyen trong khoang [0, 100]: ");
            number = sc.nextInt();
            if (number < 0 || number > 100) {
                System.out.println("So khong hop le. Vui long nhap lai!");
            }
        } while (number < 0 || number > 100);

        System.out.println("So da nhap: " + number);
        sc.close();
    }
}
