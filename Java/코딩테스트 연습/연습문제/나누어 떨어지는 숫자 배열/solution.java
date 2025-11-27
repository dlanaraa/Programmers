import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> elements = new ArrayList<>();
        
        for (int a : arr) {
            if (a % divisor == 0) elements.add(a);
        }
        
        if (elements.isEmpty()) return new int[]{-1};
        
        int[] answer = new int[elements.size()];
        for (int i = 0; i < elements.size(); i++) {
            answer[i] = elements.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}

// class Solution {
//     public int[] solution(int[] arr, int divisor) {
//         int[] answer = Arrays.stream(arr)
//                              .filter(x -> x % divisor == 0)
//                              .sorted()
//                              .toArray();
        
//         return answer.length == 0 ? new int[]{-1} : answer;
//     }
// }
