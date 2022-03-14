package Mang1Chieu;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số lượng: ");
            n = scanner.nextInt();
        }while (n <= 0);

        Integer[] array1 = new Integer[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            array1[i] = scanner.nextInt();
        }

        //Câu A
        System.out.printf("Dãy số cần tìm: %s\n", Arrays.toString(array1));

        //Câu B
        System.out.printf("Tổng dãy số: %d\n", Arrays.stream(array1).reduce(Integer::sum).get());

        //Câu C
        //SX tăng dần
        Arrays.sort(array1);
        System.out.printf("Dãy số sau khi SX tăng: %s\n", Arrays.toString(array1));
        //SX giảm dần
        Arrays.sort(array1, Collections.reverseOrder());
        System.out.printf("Dãy số sau khi SX giảm: %s\n", Arrays.toString(array1));

        //Câu D
        var oddList = Arrays.stream(array1).filter(e -> e % 2 == 1).mapToInt(Integer::intValue).toArray();
        var evenList = Arrays.stream(array1).filter(e -> e % 2 == 0).mapToInt(Integer::intValue).toArray();

        System.out.printf("Dãy số chãn: %s\n", Arrays.toString(oddList));
        System.out.printf("Dãy số lẻ: %s\n", Arrays.toString(evenList));

    }
}
