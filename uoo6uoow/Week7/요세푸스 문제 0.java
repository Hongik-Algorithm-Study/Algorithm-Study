import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        Queue<Integer> josephus = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            josephus.offer(i);
        }

        ArrayList<Integer> answer = new ArrayList<>();
        while ((!josephus.isEmpty())){
            for (int i = 1; i < k; i++) {
                josephus.offer(josephus.poll());
            }
            answer.add(josephus.poll());
        }


        System.out.print("<");
        for (int i = 0; i < n -1; i++) {
            System.out.print(answer.get(i) + ", ");
        }
        System.out.print(answer.get(n -1) + ">");
    }
}