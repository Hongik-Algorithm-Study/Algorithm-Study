import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] valuse = new int[n];

        for (int i = 0; i < n; i++) {
            valuse[i] = scanner.nextInt();
        }

        int count = 0;

        for (int i = n -1; i >= 0; i--) {
            if (k >= valuse[i]) {
                while (k >= valuse[i]){
                    k -= valuse[i];
                    count++;
                }
            }else {
                continue;
            }
        }

        System.out.println(count);
    }
}