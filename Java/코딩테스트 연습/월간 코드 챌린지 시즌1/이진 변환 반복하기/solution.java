class Solution {
    public int[] solution(String s) {
        int transformCount = 0;
        int removedZeroCount = 0;

        while (!s.equals("1")) {
            transformCount++;

            int beforeLength = s.length();
            s = s.replace("0", "");
            int afterLength = s.length();

            removedZeroCount += (beforeLength - afterLength);

            s = Integer.toBinaryString(s.length());
        }

        return new int[]{transformCount, removedZeroCount};
    }
}
