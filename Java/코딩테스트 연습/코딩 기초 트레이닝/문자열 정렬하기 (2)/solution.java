import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String low = my_string.toLowerCase();
        
        char[] arr = low.toCharArray();
        Arrays.sort(arr);
        
        return new String(arr);
    }
}