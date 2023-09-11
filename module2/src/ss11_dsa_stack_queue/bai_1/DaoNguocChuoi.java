package ss11_dsa_stack_queue.bai_1;


import java.util.Stack;

public class DaoNguocChuoi {
    public static String reverseString(String chuoi) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chuoi.length(); i++) {
            stack.push(chuoi.charAt(i));
        }
        StringBuilder output = new StringBuilder();
        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }
        return output.toString();
    }

    public static void main(String[] args) {
        String chuoi = "CodeGym";
        String ketQua = reverseString(chuoi);
        System.out.println("Chuỗi đảo ngược: " + ketQua);
    }
}

