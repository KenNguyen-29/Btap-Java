package b3.geometry;

public class TamGiac extends Hinh {
    private Diem a;
    private Diem b;
    private Diem c;

    public TamGiac(Diem a, Diem b, Diem c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double chuVi() {
        return a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
    }

    @Override
    public double dienTich() {
        // Cong thuc Heron
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double ca = c.distanceTo(a);
        double p = chuVi() / 2;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
    }

    @Override
    public String loaiHinh() {
        return "Tam Giac";
    }
}
