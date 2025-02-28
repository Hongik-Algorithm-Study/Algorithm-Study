import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> answerSet = new HashSet<>();

        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j< numbers.length; j++){
                answerSet.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[answerSet.size()];
        int index = 0;
        for(int num : answerSet){
            answer[index++] = num;
        }


        Arrays.sort(answer);
        return answer;
    }
}