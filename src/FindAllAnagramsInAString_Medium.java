import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInAString_Medium {
    public List<Integer> findAnagrams(String s, String p) {
        int windowStart = 0;
        int matched = 0;
        Map<Character, Integer> pFreq = new HashMap<>();
        List<Integer> indices = new ArrayList<>();
        for(char c : p.toCharArray())
            pFreq.put(c, pFreq.getOrDefault(c, 0) + 1);
        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++){
            char rchar = s.charAt(windowEnd);
            if(pFreq.containsKey(rchar)){
                pFreq.put(rchar, pFreq.get(rchar) - 1);
                if(pFreq.get(rchar) == 0)
                    matched++;
            }
            while(windowEnd - windowStart + 1 > p.length()){
                char lchar = s.charAt(windowStart);
                if(pFreq.containsKey(lchar)){
                    if(pFreq.get(lchar) == 0)
                        matched--;
                    pFreq.put(lchar, pFreq.get(lchar) + 1);
                }
                windowStart++;
            }
            if(pFreq.size() == matched)
                indices.add(windowStart);
        }
        return indices;
    }
}
