class Solution {
    public boolean solution(int x) {
        String n = String.valueOf(x);
        int sum = 0;
        
        for (int i = 0; i < n.length(); i++) {
            sum += (int)(n.charAt(i) - '0');
        }
        
        return (x % sum == 0) ? true : false;
    }
}