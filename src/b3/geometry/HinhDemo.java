package b3.geometry;

import java.util.Scanner;

/**
 * B3 - Bai tap hinh hoc + ke thua:
 * - Bai tap 1: Diem, DuongThang
 * - Bai tap 2: TamGiac, ChuNhat, HinhTron
 * - Bai tap ke thua: nhap tu ban phim, luu mang Hinh[]
 */
public class HinhDemo {
    public static void main(String[] args) {
        // Demo DuongThang
        Diem p1 = new Diem(0, 0);
        Diem p2 = new Diem(3, 4);
        DuongThang dt = new DuongThang(p1, p2);
        System.out.println("Do dai AB: " + dt.doDai());

        // Demo khoi tao san 2 hinh moi loai
        System.out.println("\n=== Hinh khoi tao san ===");
        Hinh[] mau = {
                new TamGiac(new Diem(0, 0), new Diem(4, 0), new Diem(0, 3)),
                new TamGiac(new Diem(1, 1), new Diem(5, 1), new Diem(3, 4)),
                new ChuNhat(5, 3),
                new ChuNhat(10, 2),
                new HinhTron(new Diem(0, 0), 2),
                new HinhTron(new Diem(1, 1), 5)
        };
        for (Hinh h : mau) {
            h.print();
        }

        // Nhap tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.print("\nBan muon nhap bao nhieu hinh? ");
        int n = sc.nextInt();
        Hinh[] hinhArr = new Hinh[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Hinh " + (i + 1) + " ---");
            System.out.println("1. Tam Giac  2. Chu Nhat  3. Hinh Tron");
            System.out.print("Chon loai: ");
            int loai = sc.nextInt();

            switch (loai) {
                case 1 -> {
                    System.out.println("Nhap toa do 3 diem:");
                    Diem a = readDiem(sc, "A");
                    Diem b = readDiem(sc, "B");
                    Diem c = readDiem(sc, "C");
                    hinhArr[i] = new TamGiac(a, b, c);
                }
                case 2 -> {
                    System.out.print("Chieu dai: ");
                    double dai = sc.nextDouble();
                    System.out.print("Chieu rong: ");
                    double rong = sc.nextDouble();
                    hinhArr[i] = new ChuNhat(dai, rong);
                }
                case 3 -> {
                    Diem o = readDiem(sc, "O");
                    System.out.print("Ban kinh: ");
                    double r = sc.nextDouble();
                    hinhArr[i] = new HinhTron(o, r);
                }
                default -> {
                    System.out.println("Loai khong hop le, dung Chu Nhat 1x1");
                    hinhArr[i] = new ChuNhat(1, 1);
                }
            }
        }

        System.out.println("\n=== Danh sach hinh ===");
        for (Hinh h : hinhArr) {
            h.print();
        }

        sc.close();
    }

    private static Diem readDiem(Scanner sc, String label) {
        System.out.print("  " + label + ".x = ");
        double x = sc.nextDouble();
        System.out.print("  " + label + ".y = ");
        double y = sc.nextDouble();
        return new Diem(x, y);
    }
}
