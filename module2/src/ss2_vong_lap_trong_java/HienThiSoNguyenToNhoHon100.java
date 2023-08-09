package ss2_vong_lap_trong_java;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int num = 0;
        while (num < 100) {
            boolean flag = true;
            if (num >= 2) {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println(num);
                }
            }
            num++;
        }
    }
}
