package ss3_mang_va_phuong_thuc_java;

import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số hàng của ma trận");
        int row = sc.nextInt();
        System.out.println("Nhập vào số cột của ma trận");
        int col = sc.nextInt();
        double[][] arr = new double[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập vào phần thứ " + i + j);
                arr[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        double max = arr[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất là:" + max + "\nỞ hàng " + maxRow + " cột " + maxCol);
    }
}
