import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        HashMap<Integer, String> pokemonName = new HashMap<>();
        HashMap<String, Integer> pokemonNum = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = reader.readLine();
            pokemonName.put(i + 1, name);
            pokemonNum.put(name, i + 1);
        }

        String[] q = new String[m];
        for (int i = 0; i < m; i++) {
            q[i] = reader.readLine();
        }

        for (int i = 0; i < m; i++) {
            if (isInteger(q[i])) {
                int key = Integer.parseInt(q[i]);
                result.append(pokemonName.get(key) + "\n");
            }else {
                result.append(pokemonNum.get(q[i]) + "\n");
            }
        }
        System.out.println(result.toString());
    }

    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}