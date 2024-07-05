package algorithm.pythagoras;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*N 입력받기*/
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(solution(N));
    }

    public static int solution(int N) {
        int answer = 0;
        ArrayList<Integer> sixList = new ArrayList<>(); ///666이 들어간 정수 배열
        boolean contain; // 666이 들어있는지 확인하는 플래그

        for (int i = 666; i < 10000000; i++) {
            String num = String.valueOf(i); //i를 문자열로 저장함
            contain = num.contains("666"); //문자열로 저장된 i가 666을 포함하는지 확인, 포함하면 true

            if (contain) {
                sixList.add(i); //배열에 666포함하는 숫자 넣기
            }
        }

        answer = sixList.get(N - 1);
        return answer;
    }