package ss14_thuat_toan_sap_xep;

import java.util.Arrays;
import java.util.Scanner;

public class CaiDatThuatToanSapXepChen {
    public static void insertionSort(int[] arr){
        int pos,x;
        for (int i = 1; i <arr.length ; i++) {
            x=arr[i];
            pos=i;
            while (pos>0 && x<arr[pos-1]){
                arr[pos]=arr[pos-1];
                pos--;
            }
            arr[pos]=x;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter list size:");
        int size= sc.nextInt();
        int[] list=new int[size];
        System.out.println("Enter "+list.length+" value");
        for (int i = 0; i < list.length; i++) {
            list[i]=sc.nextInt();
        }
        System.out.println("Your list before sorting: "+ Arrays.toString(list));
        insertionSort(list);
        System.out.println("your list after sorting: "+Arrays.toString(list));

    }
}
