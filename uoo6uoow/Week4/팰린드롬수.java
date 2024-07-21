import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = "";

        while(!n.equals("0")){
            n = scanner.nextLine();
            boolean isPalindrome = true;
            for (int i = 0; i <n.length()/2; i++) {
                if(n.charAt(i) != n.charAt(n.length() -1 - i)){
                    isPalindrome = false;
                    break;
                }
            }
            if(!n.equals("0")){
                if(isPalindrome){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }
    }
}