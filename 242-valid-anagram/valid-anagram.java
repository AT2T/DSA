class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] lettersCount = new int[26];

        for (char ch: s.toCharArray()) {
            lettersCount[ch - 'a']++;
        }

        for (char ch: t.toCharArray()) {
            if (lettersCount[ch - 'a'] == 0) {
                return false;
            }
            lettersCount[ch - 'a']--;
        }

        return true;
    }
}