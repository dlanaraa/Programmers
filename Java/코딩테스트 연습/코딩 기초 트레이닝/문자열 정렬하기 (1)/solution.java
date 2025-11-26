import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                list.add(my_string.charAt(i) - '0');
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);

        return answer;
    }
}
