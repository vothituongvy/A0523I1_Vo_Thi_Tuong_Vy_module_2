package ss11_dsa_stack_queue.bai_1;

import java.util.Stack;

public class DaoNguocPhanTu {
    public static void reverseArray(int [] arr){
     Stack <Integer> stack=new Stack<>();
        for (int i = 0; i <arr.length ; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Mảng ban đầu:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        reverseArray(arr);
        System.out.println("\nMảng sau khi đảo ngược:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
