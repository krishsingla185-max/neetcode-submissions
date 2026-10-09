class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()-1 != t.length()-1){
            return false;
        }
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars,tChars);
    }
}
