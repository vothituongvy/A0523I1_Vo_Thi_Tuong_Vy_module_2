package ss14_thuat_toan_sap_xep;

import java.util.Arrays;
import java.util.Scanner;

public class MinhHoaThuatToanSapXepChen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter list size:");
        int size= sc.nextInt();
        int[] list=new int[size];
        System.out.println("Enter "+list.length+" value");
        for (int i = 0; i < list.length; i++) {
            list[i]=sc.nextInt();
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+"\t");
        }
        insertionSort(list);
    }
    public static void insertionSort(int[] arr){
        int pos,x;
        for (int i = 1; i <arr.length ; i++) {
            x=arr[i];
            pos=i;
            while (pos>0 && x<arr[pos-1]){
                System.out.println("Lấy x ra để so sánh từng phần tử với x: "+x);
                arr[pos]=arr[pos-1];
                System.out.println("Nếu thỏa mản điều kiện thì đổi vị trí của "+arr[pos-1]+" ra phía sau và đưa "+x+" lên đầu");
                arr[pos-1]=x;
                pos--;
                System.out.println(Arrays.toString(arr));
            }
            arr[pos]=x;
        }
    }
}
