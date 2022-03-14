package Mang2Chieu;

import java.util.Arrays;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer a[][] = null, b[][] = null;

        int choose = 5;
        do {
            System.out.println(
                    "CHUONG TRINH TINH TICH 2 MA TRAN\n" +
                            "------------------------------------\n" +
                            "1. Nhập ma trận A,B\n" +
                            "2. Tinh tích C=A*B\n" +
                            "3. Hiển thị\n" +
                            "4. Thoat\n" +
                            "Chon chuc nang: "
            );
            choose = scanner.nextInt();

            switch (choose){
                case 1:
                    System.out.print("Nhap N: ");
                    int n = scanner.nextInt();
                    System.out.print("Nhap K: ");
                    int k = scanner.nextInt();
                    System.out.print("Nhap M: ");
                    int m = scanner.nextInt();
                    a = new Integer[n][k];
                    b = new Integer[k][m];
                    System.out.println("Nhập ma trận A: ");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < k; j++) {
                            System.out.printf("a[%d][%d] = ", i, j);
                            a[i][j] = scanner.nextInt();
                        }
                    }

                    System.out.println("Nhập ma trận B:");
                    for (int i = 0; i < k; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.printf("b[%d][%d] = ", i, j);
                            b[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    TichMaTran(a, b);
                    break;
                case 3:
                    HienThiMaTran(a, b);
                    break;
                case 4:
                    System.out.println("Xin cảm ơn");
                    break;
                default:
                    System.out.println("Xin vui lòng nhập lại!!!!");
                    break;
            }
        }while (choose != 4);
    }

    private static void HienThiMaTran(Integer[][] a, Integer[][] b) {
        if(a == null || b == null){
            System.out.println("Chưa nhập mảng A hoặc B");
            return;
        }

        System.out.println("Ma trận A:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
        System.out.println("Ma trận B:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.printf("%d ", b[i][j]);
            }
            System.out.println();
        }
    }

    private static void TichMaTran(Integer[][] a, Integer[][] b) {
        if(a == null || b == null){
            System.out.println("Chưa nhập mảng A hoặc B");
            return;
        }
        // Matrix to store the result
        // The product matrix will
        // be of size row1 x col2
        int MatrixOne_Row = a.length;
        int MatrixTwo_Col = b[0].length;
        int MatrixTwo_Row = b.length;

        int C[][] = new int[MatrixOne_Row][MatrixTwo_Col];

        // Multiply the two matrices
        for (int i = 0; i < MatrixOne_Row; i++) {
            for (int j = 0; j < MatrixTwo_Col; j++) {
                for (int k = 0; k < MatrixTwo_Row; k++)
                    C[i][j] += a[i][k] * b[k][j];
            }
        }

        System.out.println("Tích 2 ma trận:");
        for (int i = 0; i < MatrixOne_Row; i++) {
            for (int j = 0; j < MatrixTwo_Col; j++) {
                System.out.printf("%d ", C[i][j]);
            }
            System.out.println();
        }
    }
}
