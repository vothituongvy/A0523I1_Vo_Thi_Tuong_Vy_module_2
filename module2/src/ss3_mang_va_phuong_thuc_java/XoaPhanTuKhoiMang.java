package ss3_mang_va_phuong_thuc_java;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int arr[] = {10, 4, 6, 7, 8, 6, 0, 0, 0};
        int indexDel = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa:");
        int x = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                indexDel=i;
                for (int j = indexDel; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
