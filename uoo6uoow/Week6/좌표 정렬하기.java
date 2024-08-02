import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        int [][] coordinate = new int[n][2];

        for (int i = 0; i < n; i++) {
            String input = reader.readLine();
            String[] str = input.split(" ");
            coordinate[i][0] = Integer.parseInt(str[0]);
            coordinate[i][1] = Integer.parseInt(str[1]);
        }

        Arrays.sort(coordinate, (a, b) -> {
            if(a[0] != b[0]){
                return Integer.compare(a[0],b[0]);
            }else{
                return Integer.compare(a[1], b[1]);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(coordinate[i][0]).append(" ").append(coordinate[i][1]).append('\n');
        }
        writer.write(sb.toString());
        writer.flush();
    }
}