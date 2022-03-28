package Phieu5;

import java.util.Arrays;
import java.util.Scanner;

public class HoaDon {
    private String soHD,ngayHD;
    private int soMatHang;
    private KhachHang kh= new KhachHang();
    private Hang dsHang[];
    private float tongTienHang=0;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hoa don: ");
        soHD = scanner.nextLine();
        System.out.println("Nhap ngay hoa don: ");
        ngayHD = scanner.nextLine();
        System.out.println("Nhap so mat hang: ");
        soMatHang = scanner.nextInt();
        kh.Nhap();
        dsHang = new Hang[soMatHang];

        for (int i = 0; i < soMatHang; i++) {
            dsHang[i] = new Hang();
            dsHang[i].nhap();
            tongTienHang += dsHang[i].getThanhTien();
        }
    }

    public void inHD() {
        System.out.printf("So hoa don: %-20s Ngay Hoa Don: %-20s\n", soHD, ngayHD);
        kh.Xuat();
        Hang.inTieuDe();

        for (int i = 0; i < soMatHang; i++) {
            dsHang[i].inDL();
        }
    }
    public void sapXep(){
        Arrays.sort(dsHang);
    }
}