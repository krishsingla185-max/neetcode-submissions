class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(c);
            }
        }
        
        String forward = cleaned.toString();
        String reversed = cleaned.reverse().toString();
        
        if(reversed.equalsIgnoreCase(forward)){
            return true;
        }
        else{
            return false;
        }
    }
}