package ss2_vong_lap_trong_java;

import java.util.Scanner;

public class hien_thi_20_so_nguyen_to_dau_tien {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào số lượng số nguyên tố:");
        int n=sc.nextInt();
        int num=0;
        while(count<n){
            boolean flag=true;
            if(num>=2){
                for (int i = 2; i <num ; i++) {
                    if(num%i==0){
                        flag=false;
                    }
                }
                if(flag){
                    System.out.println(num);
                    count++;
                }
            }
            num++;
        }
    }
}
