package b3.geometry;

/** Lop truu tuong thong nhat cac hinh */
public abstract class Hinh {
    public abstract double chuVi();

    public abstract double dienTich();

    public abstract String loaiHinh();

    public void print() {
        System.out.printf(
                "%s | Chu vi: %.2f | Dien tich: %.2f%n",
                loaiHinh(), chuVi(), dienTich());
    }
}
