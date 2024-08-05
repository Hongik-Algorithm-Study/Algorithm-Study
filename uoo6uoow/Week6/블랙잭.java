import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strInput = input.split(" ");
        int n = Integer.parseInt(strInput[0]);
        int m = Integer.parseInt(strInput[1]);

        String input1 = scanner.nextLine();
        String[] num = input1.split(" ");
        int[] val = new int[n];

        for (int i = 0; i < n; i++) {
            val[i] = Integer.parseInt(num[i]);
        }

        ArrayList<Integer> sum = new ArrayList<Integer>();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    sum.add(val[i] + val[j] + val[k]);
                }
            }
        }

        sum.removeIf(v -> v > m);

        int answer = Collections.max(sum);

        System.out.println(answer);

    }
}