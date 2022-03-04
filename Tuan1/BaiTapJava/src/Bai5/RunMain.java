package Bai5;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất:");
        num1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai:");
        num2 = scanner.nextInt();
        scanner.close();
        while (num1 != num2) {
            if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        System.out.printf("Ước chung lớn nhất là: %d", num2);
    }
}
