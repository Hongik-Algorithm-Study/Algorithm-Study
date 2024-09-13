import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(reader.readLine());  // 테스트 케이스 개수

        for (int i = 0; i < T; i++) {
            String input = reader.readLine();
            System.out.println(vps(input) ? "YES" : "NO");
        }
    }
    public static boolean vps(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                stack.push(ch);  // 여는 괄호는 스택에 넣음
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;  // 스택이 비어있으면 닫는 괄호가 여는 괄호보다 많음
                }
                stack.pop();  // 여는 괄호와 닫는 괄호의 짝을 맞춤
            }
        }
        return stack.isEmpty();  // 모든 괄호가 짝이 맞으면 스택이 비어 있어야 함
    }
}