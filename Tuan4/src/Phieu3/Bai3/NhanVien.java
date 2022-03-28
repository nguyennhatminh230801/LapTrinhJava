package Phieu3.Bai3;

import java.util.Scanner;

public abstract class NhanVien {
	protected String hoTen;
	protected float namVaoLam;
	protected float phucap;

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public float getNamVaoLam() {
		return namVaoLam;
	}

	public void setNamVaoLam(float namVaoLam) {
		this.namVaoLam = namVaoLam;
	}

	public float getPhucap() {
		return phucap;
	}

	public void setPhucap(float phucap) {
		this.phucap = phucap;
	}

	public NhanVien() {

	}

	public NhanVien(String hoTen, float namVaoLam, float phucap) {
		this.hoTen = hoTen;
		this.namVaoLam = namVaoLam;
		this.phucap = phucap;
	}

	public abstract float TinhLuong();

	public float tinhPhuCap(){
		return 100000 + (2022 - namVaoLam) * 20000;
	}

	public void nhap(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		hoTen = scanner.nextLine();
		System.out.println("Nhap nam vao lam: ");
		namVaoLam = scanner.nextFloat();
		System.out.println("Nhap phu cap: ");
		phucap = scanner.nextFloat();
	}

}