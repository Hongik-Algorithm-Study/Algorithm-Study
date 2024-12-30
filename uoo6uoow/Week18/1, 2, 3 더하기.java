import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        int[] test = new int[T];
        for (int i = 0; i < test.length; i++) {
            test[i] = scanner.nextInt();
        }

        for (int i = 0; i < test.length; i++) {
            System.out.println(count(test[i]));
        }
    }

    public static int count(int n) {

        if (n <= 0) {
            return 0;
        }

        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;
        if (n >= 2) {
            dp[2] = 2;
        }
        if (n >= 3) {
            dp[3] = 4;
        }
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1]; //n - a 만드는 법에 a를 더함
        }
        return dp[n];
    }
}