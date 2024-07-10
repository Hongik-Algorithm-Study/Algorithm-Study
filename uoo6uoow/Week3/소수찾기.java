import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //n 입력
        scanner.nextLine();

        String input = scanner.nextLine(); //소수로 판별할 수 입력
        String[] strNum = input.split(" ");
        int[] num = new int[n];
        //문자열로 입력받은 배열을 정수 배열로 변환
        for (int i = 0; i < strNum.length; i++) {
            num[i] = Integer.parseInt(strNum[i]);
        }

        //소수 판별
        int count = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 2; j <= num[i]; j++) {
                if(num[i] % j == 0){
                    if(num[i] != j){
                        break;
                    }
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}