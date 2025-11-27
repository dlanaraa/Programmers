class Solution {
    public int solution(int n) {
        String ternary = Integer.toString(n, 3);
        StringBuilder rev = new StringBuilder();
        
        for (int i = ternary.length() - 1; i >= 0; i--) {
            rev.append(ternary.charAt(i));
        }
        
        return Integer.parseInt(rev.toString(), 3);
    }
}