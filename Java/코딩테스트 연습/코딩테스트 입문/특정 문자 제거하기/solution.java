class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++){
            if (my_string.charAt(i) != letter.charAt(0)){
                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString();
        
    }
}

// class Solution {
//     public String solution(String my_string, String letter) {
//         String answer = "";

//         answer = my_string.replace(letter, "");

//         return answer;
//     }
// }

// class Solution {
//     public String solution(String my_string, String letter) {
//         return my_string.replace(letter, "");
//     }
// }