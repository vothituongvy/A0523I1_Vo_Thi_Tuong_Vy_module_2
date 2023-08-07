package ss1_introduction_to_java;

import java.util.Scanner;

public class ung_dung_chuyen_doi_tien_te {
    public static void main(String[] args) {
        double tigia=23000;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào số tiền USD:");
        double usd=Double.parseDouble(sc.nextLine());
        double chuyenDoi=usd*tigia;
        System.out.println("Giá trị VND:"+chuyenDoi);
    }
}
