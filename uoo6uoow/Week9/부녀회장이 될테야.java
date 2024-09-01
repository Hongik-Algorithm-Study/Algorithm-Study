import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        int[] answer = new int[T];
        int[] k = new int[T];
        int[] n = new int[T];

        for (int i = 0; i < T; i++) {
            k[i] = scanner.nextInt();
            n[i] = scanner.nextInt();
        }

        for (int i = 0; i < T; i++) {
            answer[i] = dp(k[i], n[i]);
        }

        for (int i = 0; i < T; i++) {
            System.out.println(answer[i]);
        }
    }

    private static int dp(int k, int n) {
        int[][] room = new int[k + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            room[0][i] = i;
        }

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                for (int l = 1; l <= j ; l++) {
                    room[i][j] += room[i -1][l];
                }
            }
        }
        return room[k][n];
    }
}