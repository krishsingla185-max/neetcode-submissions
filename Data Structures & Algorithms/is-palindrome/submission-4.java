class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuilder(s).reverse().toString();
        if(reversed.equalsIgnoreCase(s)){
            return true;
        }
        else{
            return false;
        }
    }
}