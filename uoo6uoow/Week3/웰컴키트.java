import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //n 입력
        scanner.nextLine(); // \n 제거

        String input = scanner.nextLine(); //사이즈 입력 받기
        String[] sizes = input.split(" "); // 공백으로 구분해서 문자열 배열로 저장

        // T P 입력받기
        String bundle = scanner.nextLine();
        String[] tp = bundle.split(" ");
        int t = Integer.parseInt(tp[0]);
        int p = Integer.parseInt(tp[1]);

        //정수 배열로 변환
        int[] size = new int[6];
        for (int i = 0; i < sizes.length; i++) {
            size[i] = Integer.parseInt(sizes[i]);
        }

        //티셔츠 계산
        int count = 0;
        for (int i = 0; i < size.length; i++) {
            while(size[i] > 0){
                size[i] -= t;
                count++;
            }
        }

        //펜 계산
        int quotient = n / p;
        int remainder = n % p;

        System.out.println(count);
        System.out.println(quotient + " " + remainder);
    }
}