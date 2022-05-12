import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_Medium {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> triplets = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;
            search(arr, -arr[i], i+1, arr.length - 1, triplets);
        }
        return triplets;
    }
    public static void search(int[] arr, int target, int left, int right, List<List<Integer>> triplets){
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                triplets.add(Arrays.asList(-target, arr[left], arr[right]));
                left++;
                right--;
                while(left < right && arr[left] == arr[left - 1]) left++;
                while(left < right && arr[right] == arr[right + 1]) right--;
            }
            else if(sum < target)
                left++;
            else
                right--;
        }
    }
}
