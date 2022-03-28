package Phieu3.Bai2;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class KhachHangNuocNgoai extends KhachHang {
    private String quocTich;

    public KhachHangNuocNgoai() {
    }

    public KhachHangNuocNgoai(int maKH, String hoTen, Date ngayRaHoaDon, int soLuong, float donGia, String quocTich) {
        super(maKH, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.quocTich = quocTich;
    }

    @Override
    public float thanhTien() {
        return soLuong * donGia;
    }


    @Override
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma khach hang: ");
        maKH = scanner.nextInt();
        System.out.println("Nhap ten khach hang: ");
        hoTen = scanner.nextLine();
        ngayRaHoaDon = new Date(); //Default la thoi diem hien tai
        System.out.println("Nhap so luong: ");
        soLuong = scanner.nextInt();
        System.out.println("Nhap don gia: ");
        donGia = scanner.nextFloat();
        System.out.println("Nhap quoc tich: ");
        quocTich = scanner.nextLine();
    }

    @Override
    public void xuat() {
        System.out.printf("%-10d %-20s %-20s %-10d %-10.2f %-20s", maKH, hoTen, ngayRaHoaDon.toString(), soLuong, donGia, quocTich);
    }
}
