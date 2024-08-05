import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        scanner.nextLine();
        String[] input = scanner.nextLine().split(" ");
        ArrayList<Double> score = new ArrayList<Double>();

        for (int i = 0; i < n; i++) {
            score.add(Double.parseDouble(input[i]));
        }

        Double max = Collections.max(score);

        for (int i = 0; i < n; i++) {
            score.set(i, score.get(i) / max * 100);
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += score.get(i);
        }

        double answer = sum / n;

        System.out.println(answer);
    }
}