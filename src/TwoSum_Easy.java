import java.util.HashMap;

public class TwoSum_Easy {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        int tmp = 0;
        for(int i = 0; i < arr.length; i++){
            tmp = target - arr[i];
            if(indexMap.containsKey(tmp)){
                return new int[]{indexMap.get(tmp), i};
            }
            indexMap.put(arr[i],i);
        }
        return null;
    }
}
