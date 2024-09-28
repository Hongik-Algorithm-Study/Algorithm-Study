import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());

        int[] lv = new int[n];
        for (int i = 0; i < n; i++) {
            lv[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(lv);

        int cut = (int) Math.round(n * 0.15);

        int sum = 0;
        for (int i = cut; i < n - cut; i++) {
            sum += lv[i];
        }

        writer.write(String.valueOf(Math.round((float) sum / (n - cut * 2))));
        writer.flush();
    }
}