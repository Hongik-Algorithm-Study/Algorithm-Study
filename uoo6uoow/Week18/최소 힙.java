import java.io.*;
import java.util.PriorityQueue;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(reader.readLine());

            if (x == 0) {
                if (heap.isEmpty()) {
                    writer.write("0\n");
                }else {
                    writer.write(heap.poll() + " \n");
                }
            }else{
                heap.offer(x);
            }
        }
        writer.flush();
    }
}