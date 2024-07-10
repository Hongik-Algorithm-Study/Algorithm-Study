import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        char[][] board = new char[n][m];
        //m*n 크기의 보드판 입력 받기
        for (int i = 0; i < n; i++) {
            board[i] = scanner.nextLine().toCharArray();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n -8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                min = Math.min(min, find(board,i, j));
            }
        }
        System.out.println(min);
    }

    private static int find(char[][] board, int row, int col) {
        int countW = 0;
        int countB = 0;
        for (int i = row; i < row + 8; i++) {
            for (int j = col; j < col + 8; j++) {
                // 왼쪽 위가 흰색인 경우, 인덱스 합 짝수 칸이 흰색
                if ((i + j) % 2 == 0) {
                    if (board[i][j] != 'W') {
                        countW++;
                    }
                } else {
                    if (board[i][j] != 'B') {
                        countW++;
                    }
                }
                // 왼쪽 위가 검은색인 경우, 인덱스 합 짝수 칸이 검은색
                if ((i + j) % 2 == 0) {
                    if (board[i][j] != 'B') {
                        countB++;
                    }
                } else {
                    if (board[i][j] != 'W') {
                        countB++;
                    }
                }
            }
        }
        return Math.min(countW,countB);
    }
}