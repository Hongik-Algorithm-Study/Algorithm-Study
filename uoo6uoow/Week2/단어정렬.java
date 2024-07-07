import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();
        int n = scanner.nextInt();
        scanner.nextLine(); // nextInt는 숫자 입력 받은 이후 개행 문자를 남기기 때문에 빈 문자열을 반환시킴

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            input.add(word);
        }

        // 삽입 정렬 및 중복 제거
        ArrayList<String> result = sort(input);

        for (String word : result) {
            System.out.println(word);
        }
    }

    public static ArrayList<String> sort(ArrayList<String> input) {
        // HashSet을 사용하여 중복을 제거
        Set<String> set = new HashSet<>(input);
        ArrayList<String> sortedList = new ArrayList<>(set);

        // 정렬
        sortedList.sort((str1, str2) -> {
            if (str1.length() != str2.length()) {
                return str1.length() - str2.length();
            }
            return str1.compareTo(str2);
        });

        return sortedList;
    }
}
