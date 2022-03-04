package Bai3;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap N:");
        int n = sc.nextInt();
        int answer = 1;
        for (int i = 1; i <= n; i++) {
            // answer *= i means answer = answer * i;
            answer *= i;
        }

        System.out.print("Ket qua la: " + answer);
    }
}
