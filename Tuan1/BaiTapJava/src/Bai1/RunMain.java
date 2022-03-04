package Bai1;

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

        System.out.print("Nhap N: ");
        int n = scanner.nextInt();

        if (isPrimeNumber(n)){
            System.out.println("N la so nguyen to");
        }else{
            System.out.println("N khong phai la so nguyen to");
        }
    }
}
