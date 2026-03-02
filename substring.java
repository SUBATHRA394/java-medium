import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        // Map to store: Key = Character, Value = Its most recent index
        HashMap<Character, Integer> map = new HashMap<>();

        // 'left' is the start of the current window, 'right' is the end
        for (int left = 0, right = 0; right < n; right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the map, move the left pointer
            if (map.containsKey(currentChar)) {
                // We jump 'left' to the index after the previous occurrence
                // Math.max ensures we don't move 'left' backwards
                left = Math.max(map.get(currentChar) + 1, left);
            }

            // Update the last seen index of the character
            map.put(currentChar, right);

            // Calculate current window size and update maxLength
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
