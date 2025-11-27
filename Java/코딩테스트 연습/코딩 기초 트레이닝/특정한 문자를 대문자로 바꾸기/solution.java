class Solution {
    public String solution(String my_string, String alp) {
        char[] answer = new char[my_string.length()];
        
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) == alp.charAt(0)) {
                answer[i] = Character.toUpperCase(my_string.charAt(i));
            }
            else {
                answer[i] = my_string.charAt(i);
            }
        }
        
        return new String(answer);
        
    }
}

// class Solution {
//     public String solution(String my_string, String alp) {
//         StringBuilder answer = new StringBuilder();

//         for (char c : my_string.toCharArray()) {
//             if (c == alp.charAt(0)) answer.append(Character.toUpperCase(c));
//             else answer.append(c);
//         }
        
//         return answer.toString();
//     }
// }