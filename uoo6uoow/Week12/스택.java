import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if (input.equals("top")) {
                if (!stack.isEmpty()){
                    System.out.println(stack.peek());
                }else {
                    System.out.println(-1);
                }

            } else if (input.equals("size")) {
                System.out.println(stack.size());

            } else if (input.equals("empty")) {
                if (stack.isEmpty()){
                    System.out.println(1);
                }else System.out.println(0);

            } else if (input.equals("pop")) {
                if (!stack.isEmpty()){
                    System.out.println(stack.pop());
                }else {
                    System.out.println(-1);
                }
            }else if (input.startsWith("push")){
                String[] com = input.split(" ");
                int num = Integer.parseInt(com[1]);
                stack.push(num);
            }
        }
    }
}