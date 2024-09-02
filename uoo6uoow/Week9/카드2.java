import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayDeque<Integer> cards = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            cards.addLast(i);
        }

        while (cards.size() > 1) {
            cards.removeFirst();
            cards.addLast(cards.removeFirst());
        }

        System.out.println(cards.getFirst());
    }
}