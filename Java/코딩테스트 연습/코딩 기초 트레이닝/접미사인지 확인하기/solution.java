class Solution {
    public int solution(String my_string, String is_suffix) {
        String[] suffix = new String[my_string.length()];
        
        for (int i = 0; i < my_string.length(); i++) {
            suffix[i] = my_string.substring(i);
        }
        
        for (int i = 0; i < suffix.length; i++) {
            if (suffix[i].equals(is_suffix)) {
                return 1;
            }
        }
        return 0;
    }
}

// class Solution {
//     public int solution(String my_string, String is_suffix) {
//         return my_string.endsWith(is_suffix) ? 1 : 0;
//     }
// }