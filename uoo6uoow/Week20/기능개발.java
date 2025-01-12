import java.util.*;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();

        // 각 작업의 완료일 계산
        for (int i = 0; i < progresses.length; i++) {
            int days = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            queue.add(days);
        }

        List<Integer> answerList = new ArrayList<>();

        // 배포 처리
        while (!queue.isEmpty()) {
            int current = queue.poll();
            int count = 1;

            // 현재 작업과 함께 배포 가능한 작업들 확인
            while (!queue.isEmpty() && queue.peek() <= current) {
                count++;
                queue.poll();
            }

            answerList.add(count);
        }

        // List를 배열로 변환
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}