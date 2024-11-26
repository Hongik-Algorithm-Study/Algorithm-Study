import java.util.*;

public class Main {
    static int[][] field;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1}; // 상하좌우
    static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            int M = scanner.nextInt(); // 배추밭 가로 길이
            int N = scanner.nextInt(); // 배추밭 세로 길이
            int K = scanner.nextInt(); // 배추가 심어진 위치의 개수

            field = new int[N][M];
            visited = new boolean[N][M];

            // 배추 심어진 위치 입력
            for (int i = 0; i < K; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                field[y][x] = 1; // 배추가 심어져 있음을 표시
            }

            int wormCount = 0;

            // 모든 위치 탐색
            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {
                    if (field[y][x] == 1 && !visited[y][x]) {
                        bfs(x, y, N, M); // 새로운 배추 그룹 탐색
                        wormCount++;
                    }
                }
            }

            System.out.println(wormCount);
        }
    }

    // BFS로 연결된 배추 탐색
    private static void bfs(int startX, int startY, int N, int M) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY});
        visited[startY][startX] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < M && ny >= 0 && ny < N && field[ny][nx] == 1 && !visited[ny][nx]) {
                    visited[ny][nx] = true;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }
}