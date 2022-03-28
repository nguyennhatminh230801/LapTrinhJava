package Mang2Chieu;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Tạo đối tượng Scanner nhập dữ liệu
        Integer a[][] = null, b[][] = null; // Tạo 2 mảng 2 chiều A, B

        int choose = 5; //Gán 5 để vào default nếu ko nhập
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
            choose = scanner.nextInt(); //Nhập choose để chọn chức năng

            switch (choose){
                case 1: //Nhập dữ liệu
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
                    TichMaTran(a, b); //Tính tích 2 ma trận A, B
                    break;
                case 3:
                    HienThiMaTran(a, b); // Hiển thị ma trận
                    break;
                case 4:
                    System.out.println("Xin cảm ơn"); //Kết thúc chương trình
                    break;
                default:
                    System.out.println("Xin vui lòng nhập lại!!!!");
                    break;
            }
        }while (choose != 4); //Nếu lựa chọn 4 thì kết thúc chương trình
    }

    private static void HienThiMaTran(Integer[][] a, Integer[][] b) {
        if(a == null || b == null){ //Xét A, B đã được nhập chưa
            System.out.println("Chưa nhập mảng A hoặc B");
            return;
        }

        //Nhập mảng a
        System.out.println("Ma trận A:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }

        //Nhập mảng b
        System.out.println("Ma trận B:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.printf("%d ", b[i][j]);
            }
            System.out.println();
        }
    }

    private static void TichMaTran(Integer[][] a, Integer[][] b) {
        if(a == null || b == null){ //Xét A, B đã được nhập chưa
            System.out.println("Chưa nhập mảng A hoặc B");
            return;
        }
        //Ma trận có kích cỡ MatrixOne_Row * MatrixTwo_Row
        int MatrixOne_Row = a.length;
        int MatrixTwo_Col = b[0].length;
        int MatrixTwo_Row = b.length;

        int C[][] = new int[MatrixOne_Row][MatrixTwo_Col];

        // Nhân ma trận
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
