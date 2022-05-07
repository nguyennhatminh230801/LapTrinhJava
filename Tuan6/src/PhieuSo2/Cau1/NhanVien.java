package PhieuSo2.Cau1;

import java.util.Scanner;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String hoTen, int namSinh, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten bac: ");
        congViec = scanner.nextLine();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Cong viec: " + congViec);
    }
}
