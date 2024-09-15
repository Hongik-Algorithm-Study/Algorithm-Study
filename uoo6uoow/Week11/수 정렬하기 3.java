import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try(
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        ){
            //n 입력 받고 n 크기 배열 생성
            int n = Integer.parseInt(reader.readLine());
            int[] num = new int[n];

            //배열 요소 입력
            for (int i = 0; i < num.length; i++) {
                num[i] = Integer.parseInt(reader.readLine());
            }
            //정렬
            Arrays.sort(num);

            //출력
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < num.length; i++) {
                sb.append(num[i]).append('\n');
            }
            writer.write(sb.toString());
            writer.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}