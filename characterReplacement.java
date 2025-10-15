class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0, j = 0, maxLength = 0;
        HashMap<Character, Integer> mp = new HashMap<>();

        int maxCount = 0;
        while (j < s.length()) {
            char ch = s.charAt(j);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);

            maxCount = Math.max(maxCount, mp.get(ch));
            if (j - i + 1 - maxCount > k) {
                mp.put(s.charAt(i), mp.get(s.charAt(i)) - 1);
                i++;
            }
            maxLength = Math.max(maxLength, j - i + 1);
            j++;
        }

        return maxLength;
    }
}
