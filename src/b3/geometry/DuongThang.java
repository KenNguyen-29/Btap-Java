package b3.geometry;

/** Duong thang qua 2 diem A, B */
public class DuongThang {
    private Diem a;
    private Diem b;

    public DuongThang(Diem a, Diem b) {
        this.a = a;
        this.b = b;
    }

    public Diem getA() {
        return a;
    }

    public Diem getB() {
        return b;
    }

    public double doDai() {
        return a.distanceTo(b);
    }
}
