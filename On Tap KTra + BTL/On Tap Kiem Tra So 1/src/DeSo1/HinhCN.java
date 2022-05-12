package DeSo1;

import java.util.Scanner;

public class HinhCN extends HinhPhang{
    private String maHinh;
    private double chieuDai, chieuRong;

    public HinhCN() {
    }

    public HinhCN(String maHinh, double chieuDai, double chieuRong) {
        this.maHinh = maHinh;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public String getMaHinh() {
        return maHinh;
    }

    public void setMaHinh(String maHinh) {
        this.maHinh = maHinh;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhCV() {
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public double tinhDT() {
        return chieuRong * chieuDai;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã hình: ");
        maHinh = scanner.nextLine();
        System.out.print("Nhập chiều dài: ");
        chieuDai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        chieuRong = scanner.nextDouble();
    }

    public static void inTieuDe() {
        System.out.printf("%-20s %-12s %-12s %-12s %-12s\n", "Mã Hình", "Chiều Dài", "Chiều Rộng", "Chu Vi", "Diện Tích");
    }

    public void xuat() {
        System.out.printf("%-20s %-10.2f %-10.2f %-10.2f %-10.2f\n", maHinh, chieuRong, chieuDai, tinhCV(), tinhDT());
    }
}
