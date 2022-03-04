package Bai4;

import java.util.Scanner;

public class RunMain {
    public static int C(int k, int n) {
        if (k == 0 || k == n) return 1;
        if (k == 1) return n;
        return C(k - 1, n - 1) + C(k, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = scanner.nextInt();
        System.out.print("Nhap K: ");
        int k = scanner.nextInt();

        System.out.println("Ket qua la: " + C(k, n));
    }
}
