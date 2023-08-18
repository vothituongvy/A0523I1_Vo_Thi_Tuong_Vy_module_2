package ss3_mang_va_phuong_thuc_java;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong phan tu trong mang: ");
        int a = Integer.parseInt(sc.nextLine());
        int[] arr = new int[a];
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print("Nhap phan tu tai index " + i + " : ");
            int b = Integer.parseInt(sc.nextLine());
            arr[i] = b;
        }
        System.out.println("Nhập số cần chèn");
        int x = sc.nextInt();
        System.out.println("Nhập vào vị trí cần chèn");
        int index = sc.nextInt();
        if (arr[index] == 0) {
            arr[index] = x;
        } else {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
