import java.util.ArrayList;
import java.util.List;

public class InsertInterval_Medium {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        while(i < intervals.length && intervals[i][1] < newInterval[0])
            result.add(intervals[i++]);
        int start = newInterval[0];
        int end = newInterval[1];
        while(i < intervals.length && intervals[i][0] <= newInterval[1]){
            start =  Math.min(intervals[i][0], start);
            end =  Math.max(intervals[i][1], end);
            i++;
        }
        result.add(new int[]{start, end});
        while(i < intervals.length)
            result.add(intervals[i++]);
        return result.toArray(new int[0][]);
    }
}
