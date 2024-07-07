import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            /*세 변 길이 입력받기*/
            String input = scanner.nextLine();

            if (input.equals("0 0 0"))
                break; // 0 0 0입력 받으면 종료

            // 공백으로 구분된 문자열을 분리하여 문자열 배열로 변환
            String[] stringNumbers = input.split(" ");

            // 문자열 배열을 세 개의 정수에 할당
            int a = Integer.parseInt(stringNumbers[0]);
            int b = Integer.parseInt(stringNumbers[1]);
            int c = Integer.parseInt(stringNumbers[2]);

            if(result(a, b, c)){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }
    }
    private static boolean result(int a, int b, int c){
        if((sqrt(a) == sqrt(b) + sqrt(c)) ||(sqrt(b) == sqrt(a) + sqrt(c)) || sqrt(c) == sqrt(a) + sqrt(b)){
            return true;
        }else{
            return false;
        }
    }

    private static int sqrt(int num){
        return num * num;
    }
}