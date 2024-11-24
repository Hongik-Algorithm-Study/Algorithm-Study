import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer>[] com;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int pairs = scanner.nextInt();
        scanner.nextLine();


        com = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            com[i] = new ArrayList<>();
        }

        for (int i = 0; i < pairs; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            com[a].add(b);
            com[b].add(a);
        }

        visited = new boolean[n + 1];
        bfs(1);

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (visited[i]){
                count++;
            }
        }

        System.out.println(count - 1);
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (Integer next : com[node]) {
                if (!visited[next]) {
                    queue.add(next);
                    visited[next] = true;
                }
            }
        }

    }
}