package Phieu3.Bai3;

import java.util.Scanner;

public class NhanVienSanXuat extends NhanVien{
	private int soSanPham;

	public NhanVienSanXuat() {
	}

	public NhanVienSanXuat(String hoTen, float namVaoLam, float phucap, int soSanPham) {
		super(hoTen, namVaoLam, phucap);
		this.soSanPham = soSanPham;
	}

	public int getSoSanPham() {
		return soSanPham;
	}

	public void setSoSanPham(int soSanPham) {
		this.soSanPham = soSanPham;
	}

	@Override
	public float TinhLuong() {
		return soSanPham * 10000;
	}

	@Override
	public void nhap() {
		super.nhap();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so san pham: ");
		soSanPham = scanner.nextInt();
	}

	public void xuat() {
		System.out.printf("%-20s %-10.2f %-10.2f %-10d", hoTen, namVaoLam, phucap, soSanPham);
	}
}