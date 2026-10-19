package b2;

import java.util.Scanner;

/**
 * B2 - Chuoi:
 * Nhap ho ten. Chu cuoi cung la ten, con lai la ho.
 * Vi du: "Nguyen Van An " -> Ho: Nguyen Van, Ten: An
 */
public class ParseName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String fullName = sc.nextLine().trim();

        int lastSpace = fullName.lastIndexOf(' ');
        if (lastSpace < 0) {
            System.out.println("Ho: ");
            System.out.println("Ten: " + fullName);
        } else {
            String ho = fullName.substring(0, lastSpace).trim();
            String ten = fullName.substring(lastSpace + 1).trim();
            System.out.println("Ho: " + ho);
            System.out.println("Ten: " + ten);
        }
        sc.close();
    }
}
