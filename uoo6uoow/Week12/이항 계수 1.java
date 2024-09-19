import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();

        int nFac = 1;
        for (int i = 1; i <= n; i++) {
            nFac *= i;
        }

        int kFac = 1;
        for (int i = 1; i <= k; i++) {
            kFac *= i;
        }

        int dif = n - k;
        int difFac = 1;
        for (int i = 1; i <= dif; i++) {
            difFac *= i;
        }

        System.out.println((nFac / kFac) / difFac);
    }
}