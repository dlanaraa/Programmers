public class solution {
    public int Solution(int n) {
        String num = String.valueOf(n);
        int answer = 0;
        
        for (int i = 0; i < num.length(); i++) {
            answer += num.charAt(i) - '0';
        }

        return answer;
    }
}