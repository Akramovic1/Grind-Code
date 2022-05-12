import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters_Medium {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> chars = new HashMap<>();
        int windowStart = 0;
        int max = Integer.MIN_VALUE;
        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++){
            char rightChar = s.charAt(windowEnd);
            while(chars.containsKey(rightChar)){
                char leftChar = s.charAt(windowStart);
                chars.put(leftChar, chars.get(leftChar) - 1);
                if(chars.get(leftChar) == 0)
                    chars.remove(leftChar);
                windowStart++;
            }
            chars.put(rightChar ,chars.getOrDefault(rightChar, 0) + 1);
            max = Math.max(max, windowEnd - windowStart + 1);
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
