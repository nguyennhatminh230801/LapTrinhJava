public class RunMain {
    public static void main(String[] args) {
        PhongHocManager phongHocManager = new PhongHocManager();
        phongHocManager.InsertPhongHoc();
        phongHocManager.UpdatePhongHocByID(1);
        phongHocManager.DeletePhongHocByID(4);
        phongHocManager.SortPhongHocByDayNha();
        phongHocManager.SortPhongHocByDienTich();
        phongHocManager.SortPhongHocBySoBongDen();
        phongHocManager.InTongSoPhongHoc();
        phongHocManager.InDanhSachPhongHocDatChuan();
    }
}
