package Phieu5;

import java.util.Scanner;

public class Hang implements Comparable<Hang>{
    private String tenHang;
    private float soLuong, donGia;

    public Hang() {
    }

    public Hang(String tenHang, float soLuong, float donGia) {
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten hang: ");
        tenHang = scanner.nextLine();
        System.out.println("Nhap so luong: ");
        soLuong = scanner.nextInt();
        System.out.println("Nhap don gia: ");
        donGia = scanner.nextInt();
    }

    static void inTieuDe() {
        System.out.printf("%-20s %-12s %-12s %-12s\n", "Ten Hang", "So Luong", "Don Gia", "Thanh Tien");
    }

    public void inDL() {
        System.out.printf("%-20s %-10.2f %-10.2f %-10.2f\n", tenHang, soLuong, donGia, getThanhTien());
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public float getThanhTien(){
        return soLuong * donGia;
    }
    @Override
    public int compareTo(Hang o) {
        if(tenHang.equals(o.tenHang)){
            return (getThanhTien() > o.getThanhTien()) ? 1 : -1;
        }

        return tenHang.compareTo(o.tenHang);
    }
}
