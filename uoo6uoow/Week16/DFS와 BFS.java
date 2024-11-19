import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int v = scanner.nextInt();

        graph = new ArrayList[n + 1]; // 그래프 초기화
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        // 정점 번호가 작은 것을 먼저 방문하기 위해 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i]);
        }

        // DFS
        visited = new boolean[n + 1];
        dfs(v);
        System.out.println();

        // BFS
        visited = new boolean[n + 1];
        bfs(v);
    }

    static void dfs(int node) {
        System.out.print(node + " ");
        visited[node] = true;

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int next : graph[node]) {
                if (!visited[next]) {
                    queue.add(next);
                    visited[next] = true;
                }
            }
        }
        System.out.println();
    }
}