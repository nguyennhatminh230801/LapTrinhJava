package LapTrinhJavaCoSo.Bai2;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Tạo 1 đối tượng scanner đọc dữ liệu
        System.out.print("Nhập sô A: ");
        int a = scanner.nextInt(); //Phương thức nextInt lấy dữ liệu Int theo dòng, nhập số A
        System.out.print("Nhập số B: ");
        int b = scanner.nextInt(); //Phương thức nextInt lấy dữ liệu Int theo dòng, nhập số B

        //Toán học
        System.out.println("Tổng: " + (a + b)); // Tổng 2 số
        System.out.println("Hiệu: " + (a - b)); // Hiệu 2 số
        System.out.println("Tích: " + (a * b)); // Tích 2 số
        System.out.println("Thương: " + (a / b)); // Thương 2 số
        System.out.println("Phần dư: " + (a % b)); // Phần dư 2 số

        //So sánh
        System.out.println("a > b: " + (a > b)); // A lớn hơn B
        System.out.println("a >= b: " + (a >= b)); // A lớn hơn bằng B
        System.out.println("a < b: " + (a < b)); // A bé hơn B
        System.out.println("a <= b: " + (a <= b)); // A bé hơn bằng B
        System.out.println("a != b: " + (a != b)); // A khác B

        //Logic
        System.out.println("a == 0 && b == 0: " + (a == 0 && b == 0)); // Xét a == b == 0
        System.out.println("a == 0 || b == 0: " + (a == 0 || b == 0)); // Xét a hoặc b bằng 0

        //Bit
        System.out.println("a & b: " + (a & b)); // Phép AND
        System.out.println("a | b: " + (a | b)); // Phép OR
        System.out.println("a ^ b: " + (a ^ b)); // Phép XOR
    }
}
