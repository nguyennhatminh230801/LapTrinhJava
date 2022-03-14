package LapTrinhJavaCoSo.Bai1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		//Cách 1
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập 1 chuỗi từ bàn phím:");
		String string1 = scanner.nextLine();		
		System.out.println("Chuỗi vừa nhập vào: " + string1);

		//Cách 2
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Nhập 1 chuỗi từ bàn phím:");
			String string2 = bufferedReader.readLine();
			System.out.println("Chuỗi vừa nhập vào: " + string2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
