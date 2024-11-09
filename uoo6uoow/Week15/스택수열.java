import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        Stack<Integer> stack = new Stack<>();
        int current = 1;
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            while (current <= list.get(i)) {
                stack.push(current++);
                result.append("+\n");
            }
            if ((!stack.isEmpty()) && (Objects.equals(stack.peek(), list.get(i)))) { //peek이랑 List는 Integer타입이므로 ==가 아닌 equals를 써야 함
                stack.pop();
                result.append("-\n");
            }else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println(result.toString());
    }
}
