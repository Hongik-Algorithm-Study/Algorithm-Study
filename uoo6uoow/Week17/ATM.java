import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] time = new int[n];

        for (int i = 0; i < n; i++) {
            time[i] = scanner.nextInt();
        }

        Arrays.sort(time);
        int total = 0;
        int[] term = new int[n];
        term[0] = time[0];

        for (int i = 1; i < n; i++) {
            term[i] = term[i - 1] + time[i];
        }

        for (int i = 0; i < n; i++) {
            total += term[i];
        }

        System.out.println(total);
    }
}