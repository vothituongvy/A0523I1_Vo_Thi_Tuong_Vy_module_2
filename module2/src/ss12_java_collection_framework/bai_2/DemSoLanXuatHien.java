package ss12_java_collection_framework.bai_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class DemSoLanXuatHien {
    public static void main(String[] args) {
    Map<String,Integer> hashMap= new HashMap<>();
    Scanner sc= new Scanner(System.in);
    System.out.println("Nhập chuổi phân biệt từ");
    String string=sc.nextLine();
    String [] string1=string.split(" ");
        for (String element:string1) {
            Integer value = null;
            if (hashMap.containsKey(element)) {
                value = hashMap.get(element);
                value++;
                hashMap.replace(element, value);
            } else {
                hashMap.put(element,1);
            }
        }
        System.out.println("Số lần xuất hiện :"+hashMap.toString());

    }
}
