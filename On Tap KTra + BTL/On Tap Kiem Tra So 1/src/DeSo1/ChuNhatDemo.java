package DeSo1;

import java.util.*;

public class ChuNhatDemo {
    public static void main(String[] args) {
        int soLuong = 0;
        Scanner scanner = new Scanner(System.in);

        do
        {
            System.out.println("Nhập số lượng hình (1 - 10 hình): ");
            soLuong = scanner.nextInt();

            if (soLuong <= 0 || soLuong > 10){
                System.out.println("Vui lòng nhập lại !!!!!");
            }
        }while (soLuong <= 0 || soLuong > 10);

        HinhCN[] hinhCNS = new HinhCN[soLuong];



        SinhNgauNhien(hinhCNS);

        InDanhSach(hinhCNS);

        TimKiemLonNhat(hinhCNS);

        TimKiemNhoNhat(hinhCNS);
    }

    public static void TimKiemNhoNhat(HinhCN[] hinhCNS) {
        double minValue = Double.MAX_VALUE;

        for (var hinh: hinhCNS) {
            minValue = Math.min(minValue, hinh.tinhDT());
        }

        System.out.println("Danh sách hình chữ nhật nhỏ nhất: ");
        HinhCN.inTieuDe();
        for (var hinhCN: hinhCNS) {
            if(hinhCN.tinhDT() == minValue){
                hinhCN.xuat();
            }
        }
    }

    public static void TimKiemLonNhat(HinhCN[] hinhCNS) {
        double maxValue = 0;

        for (var hinh: hinhCNS) {
            maxValue = Math.max(maxValue, hinh.tinhDT());
        }

        System.out.println("Danh sách hình chữ nhật lớn nhất: ");
        HinhCN.inTieuDe();
        for (var hinhCN: hinhCNS) {
            if(hinhCN.tinhDT() == maxValue){
                hinhCN.xuat();
            }
        }
    }

    public static void InDanhSach(HinhCN[] hinhCNS) {
        HinhCN.inTieuDe();
        for (var hinhCN: hinhCNS) {
            hinhCN.xuat();
        }
    }

    public static void SinhNgauNhien(HinhCN[] hinhCNS) {
        boolean[] maHinhDaCo = new boolean[11];

        Random random = new Random();

        for (int i = 0; i < hinhCNS.length; i++) {
            while (true){
                int tempMaHinh = random.nextInt(1, 11);

                if(maHinhDaCo[tempMaHinh]) {
                    continue;
                }

                maHinhDaCo[tempMaHinh] = true;
                String maHinh = "CN" + tempMaHinh;

                hinhCNS[i] = new HinhCN();
                hinhCNS[i].setMaHinh(maHinh);
                hinhCNS[i].setChieuDai(random.nextInt(1, 101));
                hinhCNS[i].setChieuRong(random.nextInt(1,101));
                break;
            }
        }
    }
}
