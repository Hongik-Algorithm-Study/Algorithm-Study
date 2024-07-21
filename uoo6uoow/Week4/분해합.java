import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        int answer = 0;
        for (int i = 0; i < n; i++) {
            if(assemble(i) == n){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }

    public static int assemble(int a){
        int result = a;
        while(a >= 1){
            result += (a % 10);
            a /= 10;
        }
        return result;
    }
}