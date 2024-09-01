import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(solution(N));
    }

    public static int solution(int N) {
        int answer = 0;
        ArrayList<Integer> sixList = new ArrayList<>();
        boolean contain; // 666이 들어있는지 확인하는 플래그
        int six;

        for (int i = 666; i < 10000000; i++) {
            String num = String.valueOf(i);
            contain = num.contains("666");

            if (contain) {
                sixList.add(i);
            }
        }

        answer = sixList.get(N - 1);
        return answer;
    }
}