package DeSo3;

import java.util.Scanner;

public class TamGiacCan extends HinhPhang{
    private double canhA;
    private double canhB;
    private double canhC;

    public TamGiacCan() {
    }

    public TamGiacCan(double canhA, double canhB, double canhC) {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    public double getCanhA() {
        return canhA;
    }

    public void setCanhA(double canhA) {
        this.canhA = canhA;
    }

    public double getCanhB() {
        return canhB;
    }

    public void setCanhB(double canhB) {
        this.canhB = canhB;
    }

    public double getCanhC() {
        return canhC;
    }

    public void setCanhC(double canhC) {
        this.canhC = canhC;
    }

    @Override
    public double tinhCV() {
        return canhA + canhB + canhC;
    }

    @Override
    public double tinhDT() {
        double nuaChuVi = tinhCV() / 2;
        return Math.sqrt(nuaChuVi * (nuaChuVi - canhA) * (nuaChuVi - canhB) * (nuaChuVi - canhC));
    }

    public void nhap()
    {
        Scanner scanner = new Scanner(System.in);

        do
        {
            System.out.print("Nhập cạnh A: ");
            canhA = scanner.nextDouble();
            System.out.print("Nhập cạnh B: ");
            canhB = scanner.nextDouble();
            System.out.print("Nhập cạnh C: ");
            canhC = scanner.nextDouble();

            if(!kiemTraTamGiac()){
                System.out.println("Không thể tạo thành tam giác !! Vui Lòng Nhập Lại");
            }
        }while (!kiemTraTamGiac());
    }

    public static void inTieuDe() {
        System.out.printf("%-12s %-12s %-12s %-12s %-12s\n", "Cạnh A", "Cạnh B", "Cạnh C", "Chu Vi", "Diện Tích");
    }

    public void xuat() {
        System.out.printf("%-10.2f %-10.2f %-10.2f %-10.2f %-10.2f\n", canhA, canhB, canhC, tinhCV(), tinhDT());
    }

    public boolean kiemTraTamGiac() {
        return (canhA == canhB && canhA + canhB > canhC)
                && (canhB == canhC && canhB + canhC > canhA)
                && (canhC == canhA && canhA + canhC > canhB);
    }
}
