package Phieu3.Bai1;

public class HinhTron extends HinhPhang{
    float banKinh;

    public HinhTron() {
    }

    public HinhTron(float banKinh) {
        this.banKinh = banKinh;
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public float tinhCV() {
        return (float) (Math.PI * 2 * banKinh);
    }

    @Override
    public float tinhDT() {
        return (float) (Math.PI * banKinh * banKinh);
    }
}
