package ss3_mang_va_phuong_thuc_java;

import java.util.Scanner;

public class MangHaiChieuTinhTongCacSoODuongCheoChinhCuaMaTrabVuong {
    public static void main(String[] args) {
        //Ma trận vuông là một ma trận có chiều cao và chiều rộng bằng nhau.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số hàng của ma trận");
        int row = sc.nextInt();
        System.out.println("Nhập vào số cột của ma trận");
        int col = sc.nextInt();
        while (row != col) {
            System.out.println("Ma trận vuông số hàng phải bằng số cột .Nhập lại:");
            System.out.println("Nhập vào số hàng của ma trận");
            row = sc.nextInt();
            System.out.println("Nhập vào số cột của ma trận");
            col = sc.nextInt();
        }
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập vào phần thứ " + i + j);
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i][i];
        }
        System.out.println("Tổng của đường chéo chính ma trận là:" + sum);
    }
}
