package ss3_mang_va_phuong_thuc_java;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng thứ nhất");
        int n = sc.nextInt();
        System.out.println("Nhập kích thước mảng thứ hai");
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập phần tử thứ " + i + " của mảng thứ nhất");
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập phần tử thứ " + i + " của mảng thứ hai");
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr1) + "\n" + Arrays.toString(arr2));
        int arr3[] = new int[m + n];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr2.length + i] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
