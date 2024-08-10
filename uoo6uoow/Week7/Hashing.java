import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        scanner.nextLine();

        int r = 31;
        int M = 1234567891;

        char[] str = scanner.nextLine().toCharArray();
        int[] code = new int[l];

        for (int i = 0; i < l; i++) {
            code[i] = str[i] - 96;
        }

        BigInteger sum = new BigInteger("0");
        BigInteger R = BigInteger.valueOf(r);
        for (int i = 0; i < l; i++) {
            BigInteger a = BigInteger.valueOf(code[i]).multiply(R.pow(i));
            sum = sum.add(a);
        }

        System.out.println(sum.remainder(BigInteger.valueOf(M)));
    }
}