import java.util.Scanner;

public class PhongHocMayTinh extends PhongHoc{
    private int soLuongMayTinh;

    public PhongHocMayTinh() {
    }

    public PhongHocMayTinh(int maPhong, String dayNha, double dienTich, int soBongDen, int soLuongMayTinh) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soLuongMayTinh = soLuongMayTinh;
    }

    public int getSoLuongMayTinh() {
        return soLuongMayTinh;
    }

    public void setSoLuongMayTinh(int soLuongMayTinh) {
        this.soLuongMayTinh = soLuongMayTinh;
    }

    @Override
    public boolean phongHocDatChuan() {
        return super.phongHocDatChuan() && (dienTich / (float) soLuongMayTinh >= 1.5);
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng máy tính: ");
        soLuongMayTinh = scanner.nextInt();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.printf("Số lượng máy tính: %d", soLuongMayTinh);
    }
}
