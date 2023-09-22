package ss15_xu_ly_ngoai_le_va_debug;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        System.out.println("Bắt đầu chương trình ");
        Scanner sc = new Scanner(System.in);
        boolean flag ;
        do {
            flag = false;
            try {
                System.out.println("Nhập vào cạnh thứ nhất cạnh tam giác");
                double canh1 = Double.parseDouble(sc.nextLine());
                System.out.println("Nhập vào cạnh thứ hai cạnh tam giác");
                double canh2 = Double.parseDouble(sc.nextLine());
                System.out.println("Nhập vào cạnh thứ ba cạnh tam giác");
                double canh3 = Double.parseDouble(sc.nextLine());
                checkTriangle(canh1, canh2, canh3);
                System.out.println("3 cạnh tạo thành 1 tam giác");
            } catch (TriangleException e) {
                flag = true;
                System.out.println(e.getMessage());
                System.out.println("Nhập lại 3 cạnh của tam giác");
            }
        } while (flag);
        System.out.println("Kết thúc chương trình !");
    }

    public static boolean checkTriangle(double x, double y, double z) throws TriangleException {
        if (x <= 0 || y <= 0 || z <= 0) {
            throw new TriangleException("Lỗi !3 cạnh của tam giác phải lớn hơn không .");
        }
        else if (x + y <= z || x + z <= y || y + z <= x) {
            throw new TriangleException("Lỗi !Hai canh của tam giác phải lớn hơn cạnh còn lại .");
        }
        return true;
    }
}
