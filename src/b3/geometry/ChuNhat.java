package b3.geometry;

public class ChuNhat extends Hinh {
    private double dai;
    private double rong;

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public double chuVi() {
        return 2 * (dai + rong);
    }

    @Override
    public double dienTich() {
        return dai * rong;
    }

    @Override
    public String loaiHinh() {
        return "Chu Nhat";
    }
}
