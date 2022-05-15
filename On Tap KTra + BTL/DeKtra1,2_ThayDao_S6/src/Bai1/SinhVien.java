package Bai1;

import java.io.Serializable;
import java.util.Scanner;

public class SinhVien extends Nguoi {
    private String maSinhVien;
    private Diem diemHS = new Diem();

    public SinhVien() {
    }

    public SinhVien(String hoTen, int tuoi, boolean gioiTinhNam, String maSinhVien, Diem diemHS) {
        super(hoTen, tuoi, gioiTinhNam);
        this.maSinhVien = maSinhVien;
        this.diemHS = diemHS;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public Diem getDiemHS() {
        return diemHS;
    }

    public void setDiemHS(Diem diemHS) {
        this.diemHS = diemHS;
    }

    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        maSinhVien = scanner.nextLine();
        super.nhap();
        System.out.println("Nhập điểm: ");
        diemHS.nhap();
    }

    public static void inTieuDe(){
        System.out.printf("%-20s", "Mã Sinh Viên");
        System.out.printf("%-20s %-10s %-10s", "Họ Tên", "Tuổi", "Giới Tính");
        System.out.printf("%-20s %-20s %-20s %-20s\n", "Điểm 1", "Điểm 2", "Điểm 3", "Điểm Trung Bình");
    }
    @Override
    public void xuat() {
        System.out.printf("%-20s", maSinhVien);
        super.xuat();
        diemHS.xuat();
        System.out.println("");
    }
}
