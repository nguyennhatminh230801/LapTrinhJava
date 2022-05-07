public class PhongHocThucNghiem extends PhongHoc{
    private String thongTinChuyenNganh;
    private int sucChua;
    private boolean coBonRua;

    public PhongHocThucNghiem() {
    }

    public PhongHocThucNghiem(int maPhong, String dayNha, double dienTich, int soBongDen, String thongTinChuyenNganh, int sucChua, boolean coBonRua) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.thongTinChuyenNganh = thongTinChuyenNganh;
        this.sucChua = sucChua;
        this.coBonRua = coBonRua;
    }

    @Override
    public boolean phongHocDatChuan() {
        return super.phongHocDatChuan() && coBonRua;
    }

    public String getThongTinChuyenNganh() {
        return thongTinChuyenNganh;
    }

    public void setThongTinChuyenNganh(String thongTinChuyenNganh) {
        this.thongTinChuyenNganh = thongTinChuyenNganh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public boolean isCoBonRua() {
        return coBonRua;
    }

    public void setCoBonRua(boolean coBonRua) {
        this.coBonRua = coBonRua;
    }
}
