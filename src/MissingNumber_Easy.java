public class MissingNumber_Easy {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int j = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[j])
                swap(nums,i,j);
            else
                i++;
        }
        for(i = 0; i < nums.length; i++){
            int j = nums[i];
            if(i != j)
                return i;
        }
        return nums.length;
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
