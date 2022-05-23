import java.util.Collections;
import java.util.List;

public class MeetingRooms_Easy {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.size() == 0)
            return true;
        Collections.sort(intervals, (i1, i2)-> i1.start - i2.start);
        Interval interval = intervals.get(0);
        int start = interval.start;
        int end = interval.end;
        for(int i = 1; i < intervals.size(); i++){
            if(end > intervals.get(i).start)
                return false;
            else {
                start = intervals.get(i).start;
                end = intervals.get(i).end;
            }
        }
        return true;
    }
    public class Interval {
        int start, end;
        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
