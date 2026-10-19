/**
 * B3 - Bai tap 1:
 * Lop Diem (x, y) + getter/setter
 * Lop DuongThang (A, B) + tinh do dai
 */
public class BaiTap1 {

    public static void main(String[] args) {
        Diem a = new Diem(0, 0);
        Diem b = new Diem(3, 4);
        DuongThang dt = new DuongThang(a, b);

        System.out.println("A = " + dt.getA());
        System.out.println("B = " + dt.getB());
        System.out.println("Do dai AB = " + dt.doDai());
    }

    static class Diem {
        private double x, y;

        Diem(double x, double y) {
            this.x = x;
            this.y = y;
        }

        double getX() {
            return x;
        }

        void setX(double x) {
            this.x = x;
        }

        double getY() {
            return y;
        }

        void setY(double y) {
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

    static class DuongThang {
        private Diem a, b;

        DuongThang(Diem a, Diem b) {
            this.a = a;
            this.b = b;
        }

        Diem getA() {
            return a;
        }

        Diem getB() {
            return b;
        }

        double doDai() {
            return a.distanceTo(b);
        }
    }
}
