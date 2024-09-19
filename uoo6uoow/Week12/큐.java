import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String input = reader.readLine();
            if (input.equals("front")) {
                if (!queue.isEmpty()){
                    writer.write(queue.peek() + "\n");
                }else {
                    writer.write("-1\n");
                }
            } else if (input.equals("back")) {
                if (!queue.isEmpty()){
                    writer.write(queue.getLast() + "\n");
                }else {
                    writer.write("-1\n");
                }
            } else if (input.equals("size")) {
                writer.write(queue.size() + "\n");

            } else if (input.equals("empty")) {
                if (queue.isEmpty()){
                    writer.write("1\n");
                }else
                    writer.write("0\n");

            } else if (input.equals("pop")) {
                if (!queue.isEmpty()){
                    writer.write(queue.poll() + "\n");
                }else {
                    writer.write("-1\n");
                }
            }else if (input.startsWith("push")){
                String[] com = input.split(" ");
                int num = Integer.parseInt(com[1]);
                queue.offer(num);
            }
        }
        writer.flush();
    }
}