import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        HashMap<Integer, Integer> cards = new HashMap();
        String[] input = reader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int card = Integer.parseInt(input[i]);

            if (cards.containsKey(card)) {
                cards.put(card, cards.get(card) + 1);
            } else {
                cards.put(card, 1);
            }
        }

        int m = Integer.parseInt(reader.readLine());
        ArrayList<Integer> targets = new ArrayList<>();
        String[] input2 = reader.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            targets.add(Integer.parseInt(input2[i]));
        }

        for (int i = 0; i < m; i++) {
            if (cards.containsKey(targets.get(i))) {
                System.out.print(cards.get(targets.get(i)) + " ");
            }
            else{
                System.out.print(0  + " ");
            }
        }
    }
}