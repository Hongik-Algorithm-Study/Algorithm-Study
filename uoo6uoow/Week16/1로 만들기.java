import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int[] dp = new int[1000010];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        for (int i = 4; i < n + 1; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 3 == 0 && i % 2 != 0) {
                dp[i] = Math.min(dp[i / 3] + 1, dp[i]);
            } else if (i % 2 == 0 && i % 3 != 0) {
                dp[i] = Math.min(dp[i / 2] + 1, dp[i]);
            } else if (i % 2 == 0 && i % 3 == 0) {
                dp[i] = Math.min(dp[i / 3] + 1, dp[i / 2] + 1);
            }
        }
        System.out.println(dp[n]);
    }
}