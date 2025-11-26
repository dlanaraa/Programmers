
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer.add(numlist[i]);
            }
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}

// import java.util.Arrays;

// class Solution {
//     public int[] solution(int n, int[] numlist) {
//         return Arrays.stream(numlist)
//                      .filter(x -> x % n == 0)
//                      .toArray();
//     }
// }
