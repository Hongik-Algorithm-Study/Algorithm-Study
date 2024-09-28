import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 세 개의 입력을 받음
        String[] input = new String[3];
        for (int i = 0; i < 3; i++) {
            input[i] = scanner.nextLine();
        }

        int result = 0;

        // 입력 중 첫 번째로 정수인 값 찾기
        if (isInt(input[0])) {
            result = Integer.parseInt(input[0]) + 3;
        } else if (isInt(input[1])) {
            result = Integer.parseInt(input[1]) + 2;
        } else if (isInt(input[2])) {
            result = Integer.parseInt(input[2]) + 1;
        }

        // 결과에 따른 출력
        if (result % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (result % 3 == 0) {
            System.out.println("Fizz");
        } else if (result % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(result);
        }
    }

    // 문자열이 정수인지 확인하는 함수
    public static boolean isInt(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}