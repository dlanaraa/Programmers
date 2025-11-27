class Solution {
    public long solution(long n) {
        double x = Math.sqrt(n);

        if (x == (long) x) {
            long nx = (long)x + 1;
            return nx * nx;
        }

        return -1;
    }
}
