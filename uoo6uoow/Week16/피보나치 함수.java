import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] n = new int[t];
        int max = 0;

        for (int i = 0; i < t; i++) {
            n[i] = scanner.nextInt();
            if (n[i] > max) {
                max = n[i];
            }
        }

        int[][] dp = new int[Math.max(2, max + 1)][2]; //count[n][0 or 1]
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for (int i = 2; i <= max; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i -2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        for (int i = 0; i < t; i++) {
            System.out.println(dp[n[i]][0] + " " + dp[n[i]][1]);
        }
    }
}