package ss13_thuat_toan_tim_kiem;


import java.util.Scanner;

public class TimKiemNhiPhanSuDungDeQuy {
    int binarySearch(int[] arr,int left,int right, int value) {
        while (left<=right){
            int mid=(right+left)/2;
            if(arr[mid]==value){
                return mid;
            }else if (arr[mid]>value){
                return binarySearch(arr,1,mid-1,value);
            }else{
                return binarySearch(arr,1,mid+1,value);
            }
        }
        return -1;
    }
        public static void main(String[] args) {
        TimKiemNhiPhanSuDungDeQuy obj = new TimKiemNhiPhanSuDungDeQuy();
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập kích thước mảng thứ nhất");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Nhập phần tử thứ " + i + " của mảng thứ nhất");
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            System.out.println("Nhập vào value");
            int value=sc.nextInt();
            int res = obj.binarySearch(arr,0,n-1,value);
            if(res==-1){
                System.out.println("Không tìm thấy");
            }else{
                System.out.println(value+" được tồn tại "+res);
            }
    }
}
