import java.util.Scanner;

public class PhongHoc {
    protected int maPhong;
    protected String dayNha;
    protected double dienTich;
    protected int soBongDen;

    public PhongHoc() {
    }

    public PhongHoc(int maPhong, String dayNha, double dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getDayNha() {
        return dayNha;
    }

    public void setDayNha(String dayNha) {
        this.dayNha = dayNha;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }

    public boolean phongHocDatChuan(){
        return dienTich > 10 && soBongDen > 1;
    }

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Day Nha: ");
        dayNha = scanner.nextLine();
        System.out.println("Nhap Dien Tich: ");
        dienTich = scanner.nextDouble();
        System.out.println("Nhap So Bong Den: ");
        soBongDen = scanner.nextInt();
    }

    public void Xuat(){
        System.out.printf("Ma Phong: %s\n", maPhong);
        System.out.printf("Day Nha: %s\n", dayNha);
        System.out.printf("Dien Tich: %10.2f\n", dienTich);
        System.out.printf("So Bong Den: %d\n", soBongDen);
    }

}
