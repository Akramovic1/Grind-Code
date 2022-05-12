import java.util.Arrays;

public class ThreeSumSmaller_Medium {
    public int threeSumSmaller(int[] nums, int targetSum) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 0; i < nums.length - 2; i++){
            int left = i+1, right = nums.length - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum < targetSum){
                    ans += right-left;
                    left++;
                } else {
                    right--;
                }

            }
        }
        return ans;
    }
}
