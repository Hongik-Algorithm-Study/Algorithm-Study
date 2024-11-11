import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());

        String[] cal;
        String com;

        Set<Integer> set = new HashSet<>();

        while (n != 0) {
            String inputLine = reader.readLine();
            if (inputLine == null) {
                break; // 입력이 null일 경우, 반복문을 종료
            }

            cal = inputLine.split(" ");
            com = cal[0];
            int num;

            if (com.equals("add")) {
                num = Integer.parseInt(cal[1]);
                if (set.contains(num)) {
                    continue;
                }
                set.add(num);

            } else if (com.equals("check")) {
                num = Integer.parseInt(cal[1]);
                if (set.contains(num)) {
                    result.append("1\n");
                }else{
                    result.append("0\n");
                }

            } else if (com.equals("remove")) {
                num = Integer.parseInt(cal[1]);
                if (!set.contains(num)) {
                    continue;
                }
                set.remove(num);

            } else if (com.equals("toggle")) {
                num = Integer.parseInt(cal[1]);
                if (set.contains(num)) {
                    set.remove(num);
                }else{
                    set.add(num);
                }

            } else if (com.equals("all")) {
                set.clear();
                for (int i = 1; i <= 20; i++) {
                    set.add(i);
                }

            } else if (com.equals("empty")) {
                set.clear();

            }
            n--;
        }
        System.out.println(result.toString());
    }
}