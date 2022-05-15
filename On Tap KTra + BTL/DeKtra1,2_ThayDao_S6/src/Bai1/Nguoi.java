package Bai1;

import java.io.Serializable;
import java.util.Scanner;

public class Nguoi implements Serializable {
    private String hoTen;
    private int tuoi;
    private boolean gioiTinhNam;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi, boolean gioiTinhNam) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinhNam = gioiTinhNam;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioiTinhNam() {
        return gioiTinhNam;
    }

    public void setGioiTinhNam(boolean gioiTinhNam) {
        this.gioiTinhNam = gioiTinhNam;
    }

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        hoTen = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        tuoi = scanner.nextInt();

        int choose = 3;
        do {
            System.out.println("Chọn giới tính:");
            System.out.println("1. Nam");
            System.out.println("2. Nữ");
            System.out.print("Nhập lựa chọn: ");
            choose = scanner.nextInt();

            if(choose != 1 && choose != 2){
                System.out.println("Yêu cầu nhập lại !!!");
            }

            switch (choose){
                case 1:
                    gioiTinhNam = true;
                    break;
                case 2:
                    gioiTinhNam = false;
                    break;
            }
        }while (choose != 1 && choose != 2);
    }

    public void xuat(){
        System.out.printf("%-20s %-10d %-10s", hoTen, tuoi, (gioiTinhNam ? "Nam" : "Nữ"));
    }
}
