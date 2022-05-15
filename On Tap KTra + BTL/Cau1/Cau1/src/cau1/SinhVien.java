/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */

//IS-A: quan hệ kế thừa
//HAS-A: thường là quan hệ kết tập
public class SinhVien extends Nguoi{
    private String maSinhVien;
    private Diem diem = new Diem(); //quan hệ kết tập

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, Diem diem, String hoTen, int tuoi, String gioiTinh) {
        super(hoTen, tuoi, gioiTinh);
        this.maSinhVien = maSinhVien;
        this.diem = diem;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public Diem getDiem() {
        return diem;
    }

    public void setDiem(Diem diem) {
        this.diem = diem;
    }

    @Override
    public void xuat() {
        System.out.printf("%20s", maSinhVien);
        super.xuat(); //Gọi hàm xuat() của lớp cha
        diem.xuat();
        System.out.println("");//Không làm gì để xuống dòng
    }
    
    public static void inTieuDe(){
        System.out.printf("%20s", "Mã Sinh Viên");
        System.out.printf("%20s %10s %20s", "Họ Tên", "Tuổi", "Giới Tính");
        System.out.printf("%20s %20s %20s %20s", "Điểm 1", "Điểm 2", "Điểm 3", "Điểm Trung Bình");
        System.out.println("");//Không làm gì để xuống dòng
    }
    
    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap ma Sinh Vien: ");
        maSinhVien = scanner.nextLine();
        
        super.nhap(); //Gọi hàm nhap() của lớp cha
        
        System.out.println("Nhap thong tin diem sinh vien: ");
        diem.nhap();
    }
}
