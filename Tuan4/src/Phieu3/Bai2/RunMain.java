package Phieu3.Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        List<KhachHang> khachHangs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choose1 = 3;
        do {
            System.out.println("Chon khach hang: ");
            System.out.println("1. Khach hang viet nam");
            System.out.println("2. Khach hang nuoc ngoai");
            System.out.println("0. Thoat");
            choose1 = scanner.nextInt();
            switch (choose1){
                case 0:
                    break;
                case 1:
                    KhachHangVietNam khachHangVietNam = new KhachHangVietNam();
                    khachHangVietNam.nhap();
                    khachHangs.add(khachHangVietNam);
                case 2:
                    KhachHangNuocNgoai khachHangNuocNgoai = new KhachHangNuocNgoai();
                    khachHangNuocNgoai.nhap();
                    khachHangs.add(khachHangNuocNgoai);
            }
        }while (choose1 != 0);

        System.out.println("Danh sach khach hang Viet Nam: ");
        System.out.printf("%-10s %-20s %-20s %-10s %-12s %-12s %-15s", "Ma KH", "hoTen", "ngayRaHoaDon", "soLuong", "donGia", "dinhMuc", "doiTuongKH");
        for (var khach: khachHangs) {
            if(khach instanceof KhachHangVietNam){
                khach.xuat();
            }
        }

        System.out.println("Danh sach khach hang Nuoc Ngoai: ");
        System.out.printf("%-10s %-20s %-20s %-10s %-12s %-20s", "Ma KH", "hoTen", "ngayRaHoaDon", "soLuong", "donGia", "quoctich");
        for (var khach: khachHangs) {
            if(khach instanceof KhachHangNuocNgoai){
                khach.xuat();
            }
        }
    }
}
