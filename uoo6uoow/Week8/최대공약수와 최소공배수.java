import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(div(a, b));
        System.out.println(mul(a, b));
    }

    public static int div(int a, int b){
        if (a % b == 0) {
            return b;
        }
        return div(b, a % b);
    }

    public static int mul(int a, int b) {
        int r = div(a, b);
        return a * b / r;
    }
}