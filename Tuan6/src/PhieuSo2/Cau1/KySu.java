package PhieuSo2.Cau1;

import java.util.Scanner;

public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu() {
    }

    public KySu(String hoTen, int namSinh, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap nganh dao tao: ");
        nganhDaoTao = scanner.nextLine();
    }
}
