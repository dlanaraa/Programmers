class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for (int i = 0; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}

// import java.util.Arrays;

// class Solution {
//     public int[] solution(String[] strlist) {
//         return Arrays.stream(strlist)
//                      .mapToInt(s -> s.length())
//                      .toArray();
//     }
// }
