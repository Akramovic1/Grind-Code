import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber_Medium {
    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(seen.contains(nums[i]))
                return nums[i];
            else
                seen.add(nums[i]);
        }
        return -1;
    }
}
