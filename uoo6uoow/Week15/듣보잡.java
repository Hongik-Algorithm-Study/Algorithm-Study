import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        HashMap<String, Integer> notHeard = new HashMap<>();
        for (int i = 0; i < n; i++) {
            notHeard.put(reader.readLine(), i + 1);
        }

        ArrayList<String> notHeardSeen = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String name = reader.readLine();
            if (notHeard.containsKey(name)) {
                notHeardSeen.add(name);
            }
        }

        Collections.sort(notHeardSeen);

        result.append(notHeardSeen.size() + "\n");
        for (String name : notHeardSeen) {
            result.append(name + "\n");
        }
        System.out.println(result.toString());
    }
}