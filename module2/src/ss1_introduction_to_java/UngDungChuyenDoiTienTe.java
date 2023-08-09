package ss1_introduction_to_java;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double tiGia = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số tiền USD:");
        double usd = Double.parseDouble(sc.nextLine());
        double chuyenDoi = usd * tiGia;
        System.out.println("Giá trị VND:" + chuyenDoi);
    }
}
