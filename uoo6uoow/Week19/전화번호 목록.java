import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String, Boolean> map = new HashMap<>();

        for(String nums : phone_book){
            map.put(nums, true);
        }

        for (String number : phone_book){
            for(int i = 1; i < number.length(); i++){
                if(map.containsKey(number.substring(0, i))){
                    return false;
                }
            }
        }

        return answer;
    }
}