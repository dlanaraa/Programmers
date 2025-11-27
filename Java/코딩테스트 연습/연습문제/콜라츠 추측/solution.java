class Solution {
    public int solution(int num) {
        long n = num;
        int cnt = 0;
        
        while (n != 1 && cnt < 500) {
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
            cnt++;
        }
        
        return (n == 1) ? cnt : -1;
    }
}
