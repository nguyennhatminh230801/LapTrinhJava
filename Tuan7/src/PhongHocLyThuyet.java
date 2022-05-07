import java.util.Scanner;

public class PhongHocLyThuyet extends PhongHoc{
    private boolean coMayChieu;

    public PhongHocLyThuyet() {
    }

    public PhongHocLyThuyet(int maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.coMayChieu = coMayChieu;
    }

    public boolean isCoMayChieu() {
        return coMayChieu;
    }

    public void setCoMayChieu(boolean coMayChieu) {
        this.coMayChieu = coMayChieu;
    }

    @Override
    public boolean phongHocDatChuan() {
        return super.phongHocDatChuan() && coMayChieu;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phong hoc co may chieu không ? (Y/N)");
        char c = scanner.nextLine().charAt(0);
        if (c == 'Y' || c == 'y'){
            coMayChieu = true;
        }else {
            coMayChieu = false;
        }
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.printf("Có máy chiếu: %s\n", (coMayChieu ? "Có" : "Không"));
    }
}
