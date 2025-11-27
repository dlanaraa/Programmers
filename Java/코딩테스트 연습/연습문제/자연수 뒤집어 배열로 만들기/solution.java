class Solution {
    public int[] solution(long n) {
        StringBuilder rev = new StringBuilder(String.valueOf(n)).reverse();
        
        int[] answer = new int[rev.length()];
        
        for (int i = 0; i < rev.length(); i++) {
            answer[i] = (int)rev.charAt(i) - '0';
        }
        
        return answer;
    }
}