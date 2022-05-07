package PhieuSo2.Cau1;

import java.util.Scanner;

public class CanBo {
    protected String hoTen;
    protected int namSinh;
    protected String gioiTinh;
    protected String diaChi;

    public CanBo() {
    }

    public CanBo(String hoTen, int namSinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.println("Nhap nam sinh: ");
        namSinh = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = scanner.nextLine();
    }

    public void Xuat(){
        System.out.println("Ho Ten: " + hoTen);
        System.out.println("Nam sinh: " + String.valueOf(namSinh));
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Dia chi: " + diaChi);
    }
}
