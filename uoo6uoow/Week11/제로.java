import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int input = 0;
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < n; i++) {
            input = Integer.parseInt(reader.readLine());
            if (input != 0) {
                stack.push(input);
            } else if (input == 0) {
                stack.pop();
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        writer.write(String.valueOf(sum));
        writer.flush();
    }
}