public class Solution {
    public boolean solution(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }

            // 여는 괄호보다 닫는 괄호가 더 많아지면 False
            if (count < 0) {
                return false;
            }
        }

        // 모든 괄호를 처리한 후, 여는 괄호가 남아있으면 False
        return count == 0;
    }
}