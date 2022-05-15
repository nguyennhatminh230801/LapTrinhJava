package Bai1;

import java.io.Serializable;
import java.util.Scanner;

public class Diem implements Serializable {
    private double diem1, diem2, diem3, diemTrungBinh;

    public Diem() {
    }

    public Diem(double diem1, double diem2, double diem3) {
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        setDiemTrungBinh();
    }

    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
        setDiemTrungBinh();
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
        setDiemTrungBinh();
    }

    public double getDiem3() {
        return diem3;
    }

    public void setDiem3(double diem3) {
        this.diem3 = diem3;
        setDiemTrungBinh();
    }

    public void setDiemTrungBinh(){
        diemTrungBinh = (diem1 + diem2 + diem3) / 3;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public void nhap()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm số 1: ");
        diem1 = scanner.nextDouble();
        System.out.println("Nhập điểm số 2: ");
        diem2 = scanner.nextDouble();
        System.out.println("Nhập điểm số 3: ");
        diem3 = scanner.nextDouble();
        setDiemTrungBinh();
    }

    public void xuat() {
        System.out.printf("%-20.2f %-20.2f %-20.2f %-20.2f", diem1, diem2, diem3, diemTrungBinh);
    }
}
