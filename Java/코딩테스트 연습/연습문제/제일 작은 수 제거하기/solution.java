import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }

        List<Integer> list = new ArrayList<>();
        for (int x : arr) {
            list.add(x);
        }

        list.remove(Integer.valueOf(min));

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

// import java.util.*;

// class Solution {
//     public int[] solution(int[] arr) {
//         if (arr.length == 1) return new int[]{-1};
        
//         int min = Arrays.stream(arr).min().getAsInt();
        
//         return Arrays.stream(arr)
//                      .filter(x -> x != min)
//                      .toArray();
//     }
// }