import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        User[] user = new User[n];

        for (int i = 0; i < n; i++) { //나이를 따로 빼내서 저장
            String input = scanner.nextLine();
            String[] info = input.split(" ");
            user[i] = new User();
            user[i].age = Integer.parseInt(info[0]);
            user[i].name = info[1];
        }

        for (int i = 1; i < n; i++) {
            User temp = user[i];
            int aux = i -1;

            while((aux >= 0) && (user[aux].age > temp.age)){
                user[aux + 1] = user[aux];
                aux--;
            }
            user[aux + 1] = temp;
        }

        Arrays.sort(user, (u1, u2) -> Integer.compare(u1.age, u2.age));

        for (int i = 0; i < n; i++) {
            System.out.println(user[i].age + " " + user[i].name);
        }
    }

    public static class User{
        int age;
        String name;
    }
}