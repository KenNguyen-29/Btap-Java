/**
 * B3 - Bai tap 2:
 * TamGiac, ChuNhat, HinhTron — chu vi & dien tich
 * Khoi tao 2 hinh moi loai, in ket qua.
 */
public class BaiTap2 {

    public static void main(String[] args) {
        TamGiac tg1 = new TamGiac(new Diem(0, 0), new Diem(4, 0), new Diem(0, 3));
        TamGiac tg2 = new TamGiac(new Diem(1, 1), new Diem(5, 1), new Diem(3, 4));

        ChuNhat cn1 = new ChuNhat(5, 3);
        ChuNhat cn2 = new ChuNhat(10, 2);

        HinhTron ht1 = new HinhTron(new Diem(0, 0), 2);
        HinhTron ht2 = new HinhTron(new Diem(1, 1), 5);

        System.out.println("=== Tam Giac ===");
        tg1.print();
        tg2.print();

        System.out.println("=== Chu Nhat ===");
        cn1.print();
        cn2.print();

        System.out.println("=== Hinh Tron ===");
        ht1.print();
        ht2.print();
    }

    static class Diem {
        private double x, y;

        Diem(double x, double y) {
            this.x = x;
            this.y = y;
        }

        double distanceTo(Diem other) {
            double dx = x - other.x;
            double dy = y - other.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    static class TamGiac {
        private Diem a, b, c;

        TamGiac(Diem a, Diem b, Diem c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        double chuVi() {
            return a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
        }

        double dienTich() {
            double ab = a.distanceTo(b);
            double bc = b.distanceTo(c);
            double ca = c.distanceTo(a);
            double p = chuVi() / 2;
            return Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
        }

        void print() {
            System.out.printf("Tam Giac | Chu vi: %.2f | Dien tich: %.2f%n", chuVi(), dienTich());
        }
    }

    static class ChuNhat {
        private double dai, rong;

        ChuNhat(double dai, double rong) {
            this.dai = dai;
            this.rong = rong;
        }

        double chuVi() {
            return 2 * (dai + rong);
        }

        double dienTich() {
            return dai * rong;
        }

        void print() {
            System.out.printf("Chu Nhat | Chu vi: %.2f | Dien tich: %.2f%n", chuVi(), dienTich());
        }
    }

    static class HinhTron {
        private Diem o;
        private double banKinh;

        HinhTron(Diem o, double banKinh) {
            this.o = o;
            this.banKinh = banKinh;
        }

        double chuVi() {
            return 2 * Math.PI * banKinh;
        }

        double dienTich() {
            return Math.PI * banKinh * banKinh;
        }

        void print() {
            System.out.printf(
                    "Hinh Tron (tam %s, r=%.2f) | Chu vi: %.2f | Dien tich: %.2f%n",
                    o, banKinh, chuVi(), dienTich());
        }
    }
}
