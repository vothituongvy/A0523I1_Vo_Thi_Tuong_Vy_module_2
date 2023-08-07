package ss1_introduction_to_java;
import java.util.Scanner;

public class hien_thi_loi_chao {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.print("Hello "+name);

    }
}
