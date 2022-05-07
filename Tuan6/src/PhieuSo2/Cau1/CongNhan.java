package PhieuSo2.Cau1;

import java.util.Scanner;

public class CongNhan extends CanBo{
    private int bac;

    public CongNhan() {
    }

    public CongNhan(String hoTen, int namSinh, String gioiTinh, String diaChi, int bac) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten bac: ");
        bac = scanner.nextInt();
    }

    @Override
    public void Xuat() {
        super.Xuat();
    }
}
