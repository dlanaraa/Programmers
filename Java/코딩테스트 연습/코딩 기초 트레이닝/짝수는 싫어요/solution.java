class Solution {
    public int[] solution(int n) {
        int size = (n + 1) / 2;
        int[] answer = new int[size];

        for (int i = 1, j = 0; i <= n; i += 2, j++) {
            answer[j] = i;
        }

        return answer;
    }
}