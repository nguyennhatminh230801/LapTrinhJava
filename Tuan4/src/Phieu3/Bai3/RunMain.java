package Phieu3.Bai3;

import Phieu3.Bai2.KhachHangNuocNgoai;
import Phieu3.Bai2.KhachHangVietNam;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<NhanVien> nhanViens = new ArrayList<>();

        int choose1 = 3;
        do {
            System.out.println("Chon : ");
            System.out.println("1. Khach hang viet nam");
            System.out.println("2. Khach hang nuoc ngoai");
            System.out.println("0. Thoat");
            choose1 = scanner.nextInt();
            switch (choose1){
                case 0:
                    break;
                case 1:
                    NhanVien nhanVien = new NhanVienSanXuat();
                    nhanVien.nhap();
                    nhanViens.add(nhanVien);
                case 2:
                    NhanVien nhanVien2 = new NhanVienVanPhong();
                    nhanVien2.nhap();
                    nhanViens.add(nhanVien2);
            }
        }while (choose1 != 0);

        System.out.println("Danh sach nhan vien san xuat: ");
        for (var itr1 : nhanViens) {
            if(itr1 instanceof NhanVienSanXuat){
                ((NhanVienSanXuat) itr1).xuat();
            }
        }

        System.out.println("Danh sach nhan vien van phong: ");
        for (var itr1 : nhanViens) {
            if(itr1 instanceof NhanVienVanPhong){
                ((NhanVienVanPhong) itr1).xuat();
            }
        }
    }
}
