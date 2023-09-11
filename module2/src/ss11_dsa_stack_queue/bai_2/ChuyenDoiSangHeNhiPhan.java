package ss11_dsa_stack_queue.bai_2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiSangHeNhiPhan {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số muốn chuyển đổi");
        int num = Integer.parseInt(sc.nextLine());
        while (num != 0) {
            int count = num % 2;
            stack.push(count);
            num = num / 2;
        }
        System.out.print(num+"->");
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }

    }
}
