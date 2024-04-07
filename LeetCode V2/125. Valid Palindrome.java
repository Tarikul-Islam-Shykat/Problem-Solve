class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]+", "");

        int left_pointer = 0;
        int right_pointer = s.length()-1;
        boolean isPalindromeCheck = true;
        if (s.length() == 0){
            return  true;
        }
        while ( left_pointer <= right_pointer) {
            if(Character.toLowerCase(s.charAt(left_pointer)) != Character.toLowerCase(s.charAt(right_pointer))) {
                return false;
            }
            left_pointer ++;
            right_pointer--;
        }
        return  true;
    }
}
