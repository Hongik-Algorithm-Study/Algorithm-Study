import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        boolean[] prime = eratosthenes(n);

        for (int i = m; i <= n; i++) {
            if (prime[i]){
                writer.write(String.valueOf(i + "\n"));
            }
        }
        writer.flush();
    }

    public static boolean[] eratosthenes(int max){
        boolean isPrime[] = new boolean[max + 1];
        Arrays.fill(isPrime, true); //소수라고 가정
        isPrime[0] = false;
        isPrime[1] = false; //소수 x

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]){
                for (int j = i * i; j <= max ; j += i) {//i의 배수들을 제거
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }
}