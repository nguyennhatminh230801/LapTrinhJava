package LapTrinhJavaCoSo.Bai2;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập sô A: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số B: ");
        int b = scanner.nextInt();

        //Toán học
        System.out.println("Tổng: " + (a + b));
        System.out.println("Hiệu: " + (a - b));
        System.out.println("Tích: " + (a * b));
        System.out.println("Thương: " + (a / b));
        System.out.println("Phần dư: " + (a % b));

        //So sánh
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a != b: " + (a != b));

        //Logic
        System.out.println("a == 0 && b == 0: " + (a == 0 && b == 0));
        System.out.println("a == 0 || b == 0: " + (a == 0 || b == 0));

        //Bit
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
    }
}
