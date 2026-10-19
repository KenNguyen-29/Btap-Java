package b3.student;

import java.util.Scanner;

/**
 * Nhap danh sach sinh vien, in tat ca va nhung SV co TB > 5.
 */
public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("--- Sinh vien " + (i + 1) + " ---");
            System.out.print("Ho ten: ");
            String name = sc.nextLine();
            System.out.print("Diem toan: ");
            float math = sc.nextFloat();
            System.out.print("Diem ly: ");
            float physics = sc.nextFloat();
            System.out.print("Diem hoa: ");
            float chemistry = sc.nextFloat();
            sc.nextLine();
            students[i] = new Student(name, math, physics, chemistry);
        }

        System.out.println("\n=== Danh sach sinh vien ===");
        for (Student s : students) {
            s.print();
        }

        System.out.println("\n=== Sinh vien co diem TB > 5 ===");
        boolean found = false;
        for (Student s : students) {
            if (s.average() > 5) {
                s.print();
                found = true;
            }
        }
        if (!found) {
            System.out.println("(Khong co)");
        }

        sc.close();
    }
}
