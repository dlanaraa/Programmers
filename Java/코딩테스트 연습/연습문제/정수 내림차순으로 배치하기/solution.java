import java.util.*;

class Solution {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(new String(arr)).reverse();

        return Long.parseLong(sb.toString());
    }
}
