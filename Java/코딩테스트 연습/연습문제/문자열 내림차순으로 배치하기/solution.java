import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder(new String(arr));
        
        return sb.reverse().toString();
    }
}

// import java.util.*;

// class Solution {
//     public String solution(String s) {
//         char[] arr = s.toCharArray();
//         Arrays.sort(arr);
//         return new StringBuilder(new String(arr)).reverse().toString();
//     }
// }