class Solution {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }

        return result.toString();
    }
}


// class Solution {
//     public String solution(String my_string) {
//         StringBuilder result = new StringBuilder();
        
//         for (int i = 0; i < my_string.length(); i++) {
//             char c = my_string.charAt(i);
//             result.append(Character.isUpperCase(c) ? 
//                           Character.toLowerCase(c) :
//                           Character.toUpperCase(c));
//         }

//         return result.toString();
//     }
// }