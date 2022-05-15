/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cau1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        //tạo biến choose gán lựa chọn
        int choose = 5;
        
        ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
        DAOSinhVien dAOSinhVien = new DAOSinhVien();
        
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---------------------------------------------");
            System.out.println("---------------------QLSV--------------------");
            System.out.println("---------------------------------------------");
            System.out.println("-1. Nhap thong tin Sinh Vien moi            -");
            System.out.println("-2. Hien Thi DS Sinh Vien                   -");
            System.out.println("-3. Hien Thi DS Sinh Vien co DTB >= 5.0     -");
            System.out.println("-4. Thoat                                   -");
            System.out.println("---------------------------------------------");
            System.out.println("Nhap lua chon: ");
            choose = scanner.nextInt();
            
            switch (choose) {
                case 1:
                    ThemSinhVien(dAOSinhVien, dsSinhVien);
                    break;
                case 2:
                    HienThiDanhSachSinhVien(dAOSinhVien, dsSinhVien);
                    break;
                case 3:
                    DSSVDiemTrungBinhLonHonBang5(dAOSinhVien, dsSinhVien);
                    break;
                case 4:
                    System.out.println("Cam on ban su dung chuong trinh!!!");
                    break;
                default:
                    break;
            }
        } while (choose != 4);
    }

    public static void ThemSinhVien(DAOSinhVien dAOSinhVien, ArrayList<SinhVien> dsSinhVien) throws IOException {
        SinhVien sinhVien = new SinhVien();
        System.out.println("Nhap thong tin sinh vien moi: ");
        sinhVien.nhap();
        
        dsSinhVien.add(sinhVien);//Thêm sinh viên vào danh sách
        dAOSinhVien.writeData(dsSinhVien); //Lưu vào trong tệp
    }

    public static void HienThiDanhSachSinhVien(DAOSinhVien dAOSinhVien, ArrayList<SinhVien> dsSinhVien) throws IOException {
        dsSinhVien = dAOSinhVien.readData(); //Đọc dữ liệu từ tệp
        SinhVien.inTieuDe();
        for (SinhVien sinhVien : dsSinhVien) {
            sinhVien.xuat();
        }
    }

    public static void DSSVDiemTrungBinhLonHonBang5(DAOSinhVien dAOSinhVien, ArrayList<SinhVien> dsSinhVien) throws IOException {
        dsSinhVien = dAOSinhVien.readData(); //Đọc dữ liệu từ tệp
        SinhVien.inTieuDe();
        for (SinhVien sinhVien : dsSinhVien) {
            if(sinhVien.getDiem().getDiemTrungBinh() >= 5.0){
                sinhVien.xuat();
            }
        }
    }
    
}
