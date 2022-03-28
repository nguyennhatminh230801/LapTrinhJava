package Phieu3.Bai1;

public class RunMain {
    public static void main(String[] args) {
        HinhPhang[] hinhPhangs = new HinhPhang[]{
                new HinhChuNhat(10, 2),
                new HinhTron(10),
                new HinhVuong(11)
        };

        for (var hinh: hinhPhangs) {
            System.out.println(hinh);
        }
    }
}
