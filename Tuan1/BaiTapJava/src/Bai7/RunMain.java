package Bai7;

import java.util.Arrays;
import java.util.Scanner;

public class RunMain {
    public static int binarySearch(int array[], int x, int low, int high) {

        if (high >= low) {
            int mid = low + (high - low) / 2;

            // If found at mid, then return it
            if (array[mid] == x)
                return mid;

            // Search the left half
            if (array[mid] > x)
                return binarySearch(array, x, low, mid - 1);

            // Search the right half
            return binarySearch(array, x, mid + 1, high);
        }

        return -1;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong: ");
        int n = scanner.nextInt();
        System.out.println("Nhap mang: ");
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap a[" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Nhap gia tri x: ");
        int x = scanner.nextInt();
        int result = binarySearch(array, x, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}
