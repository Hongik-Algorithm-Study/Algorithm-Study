import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String input = reader.readLine();
            if (input.equals(".")) {
                break;
            }

            if (balnace(input)) {
                writer.write("yes\n");
            } else {
                writer.write("no\n");
            }
        }
        writer.flush();
    }

    public static boolean balnace(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;  // 스택이 비었거나 짝이 안 맞을 경우
                }
                stack.pop();
            } else if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return false;  // 스택이 비었거나 짝이 안 맞을 경우
                }
                stack.pop();
            }
        }
        return stack.isEmpty();  // 스택이 비었으면 균형이 맞음
    }
}
