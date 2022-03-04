package Bai13;

import java.util.Arrays;

public class RunMain {
    public static int[][] copy(int[][] src) {
        if (src == null) {
            return null;
        }

        int[][] copy = new int[src.length][];
        for (int i = 0; i < src.length; i++) {
            copy[i] = Arrays.copyOf(src[i], src[i].length);
        }

        return copy;
    }

    public static void main(String[] args) {
        int[][] src = new int[][] {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {10, 11, 12}
        };

        int[][] copy = copy(src);

        System.out.println(Arrays.deepToString(copy));
    }
}
