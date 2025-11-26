class Solution {
    public int[] solution(int[] array) {
        int max = array[0];
        int max_idx = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                max_idx = i;
            }
        }

        return new int[] {max, max_idx};
    }
}
