import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        Arrays.sort(array);
        
        for (int i=array.length-1; i >= 0; i--)
            if (height >= array[i])
                return answer;
            else answer += 1;
        
        return answer;
    }
}