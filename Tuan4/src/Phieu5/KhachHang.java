package Phieu5;

import java.util.Scanner;

public class KhachHang {
    private String hoten,diaChi;

    public KhachHang() {
    }

    public KhachHang(String hoten, String diaChi) {
        this.hoten = hoten;
        this.diaChi = diaChi;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
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
        hoten = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = scanner.nextLine();
    }

    public void Xuat(){
        System.out.printf("Khach Hang: %-20s Dia Chi: %-20s\n", hoten, diaChi);
    }
}
