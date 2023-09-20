package ss13_thuat_toan_tim_kiem;

import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoiLienTiepCoDaiLonNhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Character> max=new LinkedList<>();
        LinkedList<Character> list=new LinkedList<>();
        System.out.println("Nhập chuổi: ");
        String string=sc.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if(list.size()>1 && string.charAt(i)<= list.getLast() && list.contains(string.charAt(i))){
                list.clear();
            }
            list.add(string.charAt(i));
            if(list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
        }
        for (Character character:max) {
            System.out.print(character);
        }
        System.out.println();
    }
}
