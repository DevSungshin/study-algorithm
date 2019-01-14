class Solution {
    public String solution(String s) {
        String answer = "";
        int index = s.length() / 2;

        if (s.length() % 2 != 0) {
            return String.valueOf(s.charAt(index));
        } else {
            return String.valueOf(s.substring(index - 1, index + 1));
        }
    }
}