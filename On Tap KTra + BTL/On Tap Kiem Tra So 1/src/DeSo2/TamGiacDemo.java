package DeSo2;

import DeSo1.HinhCN;

import java.util.Random;
import java.util.Scanner;

public class TamGiacDemo {
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

        TamGiac[] tamGiacs = new TamGiac[soLuong];

        SinhNgauNhien(tamGiacs);

        InDanhSach(tamGiacs);

        TimKiemLonNhat(tamGiacs);

        TimKiemNhoNhat(tamGiacs);
    }

    public static void TimKiemNhoNhat(TamGiac[] tamGiacs){
        double minValue = Double.MAX_VALUE;

        for (var hinh: tamGiacs) {
            minValue = Math.min(minValue, hinh.tinhCV());
        }

        System.out.println("Danh sách hình chữ nhật nhỏ nhất: ");
        HinhCN.inTieuDe();
        for (var tamGiac: tamGiacs) {
            if(tamGiac.tinhCV() == minValue){
                tamGiac.xuat();
            }
        }
    }
    public static void TimKiemLonNhat(TamGiac[] tamGiacs){
        double maxValue = 0;

        for (var hinh: tamGiacs) {
            maxValue = Math.max(maxValue, hinh.tinhCV());
        }

        System.out.println("Danh sách hình chữ nhật lớn nhất: ");
        HinhCN.inTieuDe();
        for (var tamGiac: tamGiacs) {
            if(tamGiac.tinhCV() == maxValue){
                tamGiac.xuat();
            }
        }
    }

    public static void InDanhSach(TamGiac[] tamGiacs) {
        HinhCN.inTieuDe();
        for (var tamGiac: tamGiacs) {
            tamGiac.xuat();
        }
    }

    public static void SinhNgauNhien(TamGiac[] tamGiacs) {
        Random random = new Random();

        for (int i = 0; i < tamGiacs.length; i++) {
            tamGiacs[i] = new TamGiac();
            do {
                tamGiacs[i].setCanhA(random.nextInt(1, 101));
                tamGiacs[i].setCanhB(random.nextInt(1, 101));
                tamGiacs[i].setCanhC(random.nextInt(1, 101));
            } while (!tamGiacs[i].kiemTraTamGiac()) ;
        }
    }
}
