package ss3_mang_va_phuong_thuc_java;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần chèn");
        int x = sc.nextInt();
        System.out.println("Nhập vào vị trí cần chèn");
        int index = sc.nextInt();
        if (index <= 1 || index >= arr.length - 1) {
            System.out.println("Không thể chèn phần tử " + x + " vào mảng");
        }
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = x;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
