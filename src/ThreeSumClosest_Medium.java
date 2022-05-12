import java.util.Arrays;

public class ThreeSumClosest_Medium {
    public int threeSumClosest(int[] arr, int targetSum) {
        Arrays.sort(arr);
        int result = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length - 2; i++){
            if(i > 0 && arr[i] == arr[i-1])
                continue;
            int left = i + 1;
            int right = arr.length - 1;
            while(left < right){
                int diff = targetSum - arr[i] - arr[left] - arr[right];
                if(diff == 0)
                    return targetSum;
                if(Math.abs(diff) < Math.abs(min))
                    min = diff;
                if(diff > 0)
                    left++;
                else
                    right--;
            }
        }
        return targetSum - min;
    }
}
