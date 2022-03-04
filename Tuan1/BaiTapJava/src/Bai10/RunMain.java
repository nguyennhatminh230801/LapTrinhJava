package Bai10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RunMain {
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong: ");
        int n = scanner.nextInt();
        System.out.println("Nhap mang: ");
        ArrayList<Integer> soNguyenTos = new ArrayList<>();
        ArrayList<Integer> soThuong = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            int x = scanner.nextInt();
            if(isPrimeNumber(x)){
                soNguyenTos.add(x);
            }
            else {
                soThuong.add(x);
            }
        }

        Collections.sort(soNguyenTos);
        soNguyenTos.addAll(soThuong);

        System.out.println("Ket qua la : " + soNguyenTos);
    }
}
