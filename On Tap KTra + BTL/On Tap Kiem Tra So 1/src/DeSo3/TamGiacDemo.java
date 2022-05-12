package DeSo3;


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

        TamGiacCan[] tamGiacs = new TamGiacCan[soLuong];

        SinhNgauNhien(tamGiacs);

        InDanhSach(tamGiacs);

        TimKiemLonNhat(tamGiacs);

        TimKiemNhoNhat(tamGiacs);
    }

    public static void TimKiemNhoNhat(TamGiacCan[] tamGiacs){
        double minValue = Double.MAX_VALUE;

        for (var hinh: tamGiacs) {
            minValue = Math.min(minValue, hinh.tinhCV());
        }

        System.out.println("Danh sách hình chữ nhật nhỏ nhất: ");
        TamGiacCan.inTieuDe();
        for (var tamGiac: tamGiacs) {
            if(tamGiac.tinhCV() == minValue){
                tamGiac.xuat();
            }
        }
    }
    public static void TimKiemLonNhat(TamGiacCan[] tamGiacs){
        double maxValue = 0;

        for (var hinh: tamGiacs) {
            maxValue = Math.max(maxValue, hinh.tinhCV());
        }

        System.out.println("Danh sách hình chữ nhật lớn nhất: ");
        TamGiacCan.inTieuDe();
        for (var tamGiac: tamGiacs) {
            if(tamGiac.tinhCV() == maxValue){
                tamGiac.xuat();
            }
        }
    }

    public static void InDanhSach(TamGiacCan[] tamGiacs) {
        TamGiacCan.inTieuDe();
        for (var tamGiac: tamGiacs) {
            tamGiac.xuat();
        }
    }

    public static void SinhNgauNhien(TamGiacCan[] tamGiacs) {
        Random random = new Random();

        for (int i = 0; i < tamGiacs.length; i++) {
            tamGiacs[i] = new TamGiacCan();
            do {
                int temp1 = random.nextInt(1, 101);
                tamGiacs[i].setCanhA(temp1);
                tamGiacs[i].setCanhB(temp1);
                tamGiacs[i].setCanhC(random.nextInt(1, 101));
            } while (!tamGiacs[i].kiemTraTamGiac()) ;
        }
    }
}
