package Phieu3.Bai2;

import java.util.Date;
import java.util.Scanner;

public class KhachHangVietNam extends KhachHang{
    private DoiTuongKH doiTuongKH;
    private float dinhMuc;

    public KhachHangVietNam() {
    }

    public DoiTuongKH getDoiTuongKH() {
        return doiTuongKH;
    }

    public void setDoiTuongKH(DoiTuongKH doiTuongKH) {
        this.doiTuongKH = doiTuongKH;
    }

    public float getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(float dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public KhachHangVietNam(int maKH, String hoTen, Date ngayRaHoaDon, int soLuong, float donGia, DoiTuongKH doiTuongKH, float dinhMuc) {
        super(maKH, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.doiTuongKH = doiTuongKH;
        this.dinhMuc = dinhMuc;
    }

    @Override
    public float thanhTien() {
        if(soLuong <= dinhMuc){
            return soLuong * donGia;
        }
        else {
            return soLuong * donGia * dinhMuc + (soLuong - dinhMuc) * donGia * 2.5f;
        }
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
        System.out.println("Nhap dinh muc: ");
        dinhMuc = scanner.nextFloat();

        int choose = 3;
        do{
            System.out.println("Chon kieu khach hang: ");
            System.out.println("0. Sinh Hoat");
            System.out.println("1. Kinh Doanh");
            System.out.println("2. San Xuat");
            System.out.print("Nhap lua chon: ");
            choose = scanner.nextInt();

            switch (choose) {
                case 0:
                    doiTuongKH = DoiTuongKH.SINH_HOAT;
                    break;
                case 1:
                    doiTuongKH = DoiTuongKH.KINH_DOANH;
                    break;
                case 2:
                    doiTuongKH = DoiTuongKH.SAN_XUAT;
                    break;
            }
        }while (choose < 0 || choose > 2);
    }

    @Override
    public void xuat() {
        System.out.printf("%-10d %-20s %-20s %-10d %-10.2f %-10.2f %-15s", maKH, hoTen, ngayRaHoaDon, soLuong, donGia, dinhMuc, doiTuongKH.name());
    }
}
