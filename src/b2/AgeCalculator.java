package b2;

import java.util.Calendar;
import java.util.Scanner;

/**
 * B2 - Scanner:
 * Nhap nam sinh [1900, 2010], in ra tuoi.
 */
public class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int birthYear;

        do {
            System.out.print("Nhap nam sinh trong khoang [1900, 2010]: ");
            birthYear = sc.nextInt();
            if (birthYear < 1900 || birthYear > 2010) {
                System.out.println("Nam sinh khong hop le. Vui long nhap lai!");
            }
        } while (birthYear < 1900 || birthYear > 2010);

        Calendar c = Calendar.getInstance();
        int currentYear = c.get(Calendar.YEAR);
        int age = currentYear - birthYear;

        System.out.println("Tuoi cua ban: " + age);
        sc.close();
    }
}
