package Phieu3.Bai1;

public class HinhChuNhat extends HinhPhang{
    float chieuDai;
    float chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public float tinhCV() {
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public float tinhDT() {
        return chieuRong * chieuDai;
    }
}
