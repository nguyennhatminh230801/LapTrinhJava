package Mang1Chieu;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Tạo 1 đối tượng scanner đọc dữ liệu
        int n;
        do {
            System.out.print("Nhập số lượng: ");
            n = scanner.nextInt(); // Số lượng N
        }while (n <= 0); //Nhập số lượng nếu bé hơn bằng 0 thì nhập lại

        Integer[] array1 = new Integer[n]; // Tạo 1 mảng N số

        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            array1[i] = scanner.nextInt(); //Nhập từng phần từ mảng
        }

        //Câu A
        System.out.printf("Dãy số cần tìm: %s\n", Arrays.toString(array1)); //Arrays.toString() biến 1 mảng thành String

        //Câu B
        //Tạo 1 stream và sử dụng reduce theo sum để thu gọn về 1 giá trị tổng
        System.out.printf("Tổng dãy số: %d\n", Arrays.stream(array1).reduce(Integer::sum).get());

        //Câu C
        //SX tăng dần
        Arrays.sort(array1);
        System.out.printf("Dãy số sau khi SX tăng: %s\n", Arrays.toString(array1));
        //SX giảm dần
        Arrays.sort(array1, Collections.reverseOrder()); // Sử dụng Collections.reverseOrder() để đảo ngược chiều
        System.out.printf("Dãy số sau khi SX giảm: %s\n", Arrays.toString(array1));

        //Câu D
        // Tạo 1 stream lọc số lẻ
        var oddList = Arrays.stream(array1).filter(e -> e % 2 == 1).mapToInt(Integer::intValue).toArray();
        // Tạo 1 stream lọc số chẵn
        var evenList = Arrays.stream(array1).filter(e -> e % 2 == 0).mapToInt(Integer::intValue).toArray();

        System.out.printf("Dãy số chãn: %s\n", Arrays.toString(oddList));
        System.out.printf("Dãy số lẻ: %s\n", Arrays.toString(evenList));

    }
}
