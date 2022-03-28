package Phieu3.Bai1;

public class HinhVuong extends HinhPhang{
    float canh;

    public HinhVuong() {
    }

    public HinhVuong(float canh) {
        this.canh = canh;
    }

    public float getCanh() {
        return canh;
    }

    public void setCanh(float canh) {
        this.canh = canh;
    }

    @Override
    public float tinhCV() {
        return 4 * canh;
    }

    @Override
    public float tinhDT() {
        return canh * canh;
    }
}
