import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        String[] input = reader.readLine().split(" ");
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i <n; i++) {
            list.add(Integer.parseInt(input[i]));
        }

        int m = Integer.parseInt(reader.readLine());
        input = reader.readLine().split(" ");
        ArrayList<Integer> target = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            target.add(Integer.parseInt(input[i]));
        }

        StringBuilder sb = new StringBuilder();
        int answer = 0;
        for (int i = 0; i < m; i++) {
            if (list.contains(target.get(i))){
                answer = 1;
            }else{
                answer = 0;
            }
            sb.append(answer).append('\n');
        }
        writer.write(sb.toString());
        writer.flush();
    }
}