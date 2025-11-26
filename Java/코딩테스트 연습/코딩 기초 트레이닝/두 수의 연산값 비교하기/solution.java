class Solution {
    public int solution(int a, int b) {
        String con = String.valueOf(a) + String.valueOf(b);
        int cal = 2 * a * b;
        
        return (Integer.parseInt(con) > cal) ? Integer.parseInt(con) : cal;
    }
}