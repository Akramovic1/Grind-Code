import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals_Medium {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b)-> a[0] - b[0]);
        int[] interval = intervals[0];
        int start = interval[0];
        int end = interval[1];
        List<int[]> result = new ArrayList<>();
        for(int[] i : intervals){
            if(end >= i[0]){
                start = Math.min(start,i[0]);
                end = Math.max(end,i[1]);
            } else {
                result.add(new int[]{start,end});
                start = i[0];
                end = i[1];
            }
        }
        result.add(new int[]{start,end});
        return result.toArray(new int[0][]);
    }
}
