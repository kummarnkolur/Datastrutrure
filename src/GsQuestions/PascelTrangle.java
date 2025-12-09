package GsQuestions;

import java.util.ArrayList;
import java.util.List;

public class PascelTrangle {
    public static void printPascleTrangle(int n) {
        int[][] arr = new int[n][n];
        List<List<Integer>> superList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> subList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    System.out.print("1" + " ");
                    arr[i][j] = 1;
                    subList.add(1);
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j]; //i=3,j=2
                    System.out.print(arr[i][j] + " ");
                    subList.add(arr[i][j]);
                }
            }
            System.out.println();
            superList.add(subList);
        }
        System.out.println(superList);
    }
    public static void main(String[] args) {
        printPascleTrangle(6);
    }
}
