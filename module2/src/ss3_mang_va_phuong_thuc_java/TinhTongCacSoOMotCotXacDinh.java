package ss3_mang_va_phuong_thuc_java;

import java.util.Scanner;

public class TinhTongCacSoOMotCotXacDinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số hàng của ma trận");
        int row = sc.nextInt();
        System.out.println("Nhập vào số cột của ma trận");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập vào phần thứ " + i + j);
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Nhập vào số cột muốn tính");
        int colSum=sc.nextInt();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i][colSum];
        }
        System.out.println(sum);
    }
}
