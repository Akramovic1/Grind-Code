import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement_Medium {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int windowStart = 0;
        int maxRepeated = 0;
        int max = Integer.MIN_VALUE;
        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++){
            char rightChar = s.charAt(windowEnd);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            maxRepeated = Math.max(maxRepeated, map.get(rightChar));
            while(windowEnd - windowStart + 1 - maxRepeated > k){
                char leftChar = s.charAt(windowStart);
                map.put(leftChar, map.getOrDefault(leftChar, 0) - 1);
                if(map.get(leftChar) == 0)
                    map.remove(leftChar);
                windowStart++;
            }
            max = Math.max(max, windowEnd - windowStart + 1);
        }
        return max;
    }
}
