package ss11_dsa_stack_queue.bai_4;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDauNgoac {
    public static boolean checkParentheses(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char sym = expression.charAt(i);

            if (sym == '(' || sym == '[' || sym == '{') {
                stack.push(sym);
            } else if (sym == ')' || sym == ']' || sym == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char left = stack.pop();

                if ((sym == ')' && left != '(') || (sym == ']' && left != '[') || (sym == '}' && left != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập biểu thức chứa dấu ngoặc:");
        String expression = sc.nextLine();
        boolean result = checkParentheses(expression);
        if (result) {
            System.out.println("Biểu thức có dấu ngoặc đúng.");
        } else {
            System.out.println("Biểu thức có dấu ngoặc sai.");
        }
    }
}
