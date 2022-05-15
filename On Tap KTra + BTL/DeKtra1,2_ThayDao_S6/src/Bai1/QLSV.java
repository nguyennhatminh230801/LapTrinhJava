package Bai1;

import java.io.IOException;
import java.util.ArrayList;

public class QLSV {
    private static ArrayList<SinhVien> sinhViens = new ArrayList<>();
    private static SinhVienDAO sinhVienDAO = new SinhVienDAO();

    public static void main(String[] args) throws IOException {
        SinhVien sinhVien = new SinhVien();
        ThemSinhVien(sinhVien, sinhVienDAO, sinhViens);
        InDanhSachSinhVien(sinhVienDAO, sinhViens);
        TimKiemHienThiSinhVienCoDiemTrungBinhLonHon5(sinhVienDAO, sinhViens);
    }

    public static void TimKiemHienThiSinhVienCoDiemTrungBinhLonHon5(SinhVienDAO sinhVienDAO, ArrayList<SinhVien> sinhViens) throws IOException {
        sinhViens = sinhVienDAO.readData();
        SinhVien.inTieuDe();
        for (var sinhVien: sinhViens) {
            if (sinhVien.getDiemHS().getDiemTrungBinh() >= 5.0){
                sinhVien.xuat();
            }
        }
    }

    public static void InDanhSachSinhVien(SinhVienDAO sinhVienDAO, ArrayList<SinhVien> sinhViens) throws IOException {
        sinhViens = sinhVienDAO.readData();
        SinhVien.inTieuDe();
        for (var sinhVien: sinhViens) {
            sinhVien.xuat();
        }
    }

    public static void ThemSinhVien(SinhVien sinhVien, SinhVienDAO sinhVienDAO, ArrayList<SinhVien> sinhViens) throws IOException {
        System.out.println("Nhập thông tin sinh viên: ");
        sinhVien.nhap();
        sinhViens.add(sinhVien);
        sinhVienDAO.writeData(sinhViens);
    }
}
