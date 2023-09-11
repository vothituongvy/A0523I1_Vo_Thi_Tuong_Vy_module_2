package ss11_dsa_stack_queue.bai_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class KiemTraChuoiPalindrome {
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            stack.push(c);
            queue.add(c);
        }

        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "able was I ere I saw elba";
        if (isPalindrome(str)) {
            System.out.println("Chuỗi là Palindrome");
        } else {
            System.out.println("Chuỗi không phải là Palindrome");
        }
    }
}
