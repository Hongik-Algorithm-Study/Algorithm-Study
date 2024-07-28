import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        int count = 1;
        int from = 2;

        for (int i = 0; i < n; i++) {
            int to = from + 6 * (i + 1);
            if (n == 1){
                break;
            }
            if ((n >= from) && (n < to)){
                count++;
                break;
            }else {
                from = to;
                count++;
            }
        }
        System.out.println(count);
    }
}