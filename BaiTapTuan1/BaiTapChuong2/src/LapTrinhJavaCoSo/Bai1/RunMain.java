package LapTrinhJavaCoSo.Bai1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		//Cách 1
		Scanner scanner = new Scanner(System.in); //Tạo 1 đối tượng scanner đọc dữ liệu;
		System.out.print("Nhập 1 chuỗi từ bàn phím:");
		String string1 = scanner.nextLine(); //Phương thức nextLine lấy String dữ liệu theo dòng
		System.out.println("Chuỗi vừa nhập vào: " + string1);

		//Cách 2
		BufferedReader bufferedReader = null; //Tạo 1 đối tượng BufferReader đọc dữ liệu;
		//Sử dụng try...catch bẫy lỗi hoạt động
		try {
			//Khởi tạo đối tượng bằng 1 lớp InputStreamReader
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Nhập 1 chuỗi từ bàn phím:");
			String string2 = bufferedReader.readLine(); //Phương thức readLine lấy String dữ liệu theo dòng
			System.out.println("Chuỗi vừa nhập vào: " + string2);
		} catch (Exception e) {
			e.printStackTrace(); //Xảy ra Exception sẽ có thông báo lỗi
		}
	}
}
