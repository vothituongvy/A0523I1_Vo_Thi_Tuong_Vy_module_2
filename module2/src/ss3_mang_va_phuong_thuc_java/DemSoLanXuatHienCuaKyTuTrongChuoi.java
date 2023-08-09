package ss3_mang_va_phuong_thuc_java;

public class DemSoLanXuatHienCuaKyTuTrongChuoi {
    public static void main(String[] args) {
        String str = "abcavhfa";
        char a = 'a';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của kí tự " + a + " trong chuỗi là: " + count);
    }
}
