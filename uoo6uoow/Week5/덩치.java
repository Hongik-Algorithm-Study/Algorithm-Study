import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        int[][] vol = new int[n][2];//덩치 저장 배열

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] strVol = input.split(" ");
            vol[i][0] = Integer.parseInt(strVol[0]);
            vol[i][1] = Integer.parseInt(strVol[1]);
        }

        int[] rank  = new int[n];
        for (int i = 0; i < n; i++) {
            rank[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i != j){
                    if((vol[i][0] > vol[j][0]) && (vol[i][1] > vol[j][1])){
                        rank[j]++;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(rank[i] + " ");
        }
    }
}