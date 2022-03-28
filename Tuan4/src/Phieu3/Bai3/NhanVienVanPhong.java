package Phieu3.Bai3;

import java.util.Scanner;

public class NhanVienVanPhong extends NhanVien{

	private float mucLuong;
	private int ngayNghi;

	@Override
	public float TinhLuong() {
		return (mucLuong - ngayNghi) * 10000;
	}

	@Override
	public void nhap() {
		super.nhap();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap muc luong: ");
		mucLuong = scanner.nextFloat();
		System.out.println("Nhap ngay nghi: ");
		ngayNghi = scanner.nextInt();
	}

	public void xuat() {
		System.out.printf("%-20s %-10.2f %-10.2f %-10.2f %-10d", hoTen, namVaoLam, phucap, mucLuong, ngayNghi);
	}
}