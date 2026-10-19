package b3.geometry;

public class HinhTron extends Hinh {
    private Diem o;
    private double banKinh;

    public HinhTron(Diem o, double banKinh) {
        this.o = o;
        this.banKinh = banKinh;
    }

    @Override
    public double chuVi() {
        return 2 * Math.PI * banKinh;
    }

    @Override
    public double dienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public String loaiHinh() {
        return "Hinh Tron";
    }

    public Diem getO() {
        return o;
    }
}
