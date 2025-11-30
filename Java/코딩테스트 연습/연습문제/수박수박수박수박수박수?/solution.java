class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        sb.append("수박".repeat(n/2));
        
        if (n % 2 != 0) sb.append("수");

        return sb.toString();
    }
}