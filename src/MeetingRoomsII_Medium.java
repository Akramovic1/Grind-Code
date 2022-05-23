import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MeetingRoomsII_Medium {
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals.size() == 0)
            return 0;
        Collections.sort(intervals, (i1, i2)-> i1.start - i2.start);
        int counter = 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(intervals.get(0).end);
        for(int i = 1; i < intervals.size(); i++){
            if(pq.peek() <= intervals.get(i).start)
                pq.poll();
            pq.add(intervals.get(i).end);
            counter = Math.max(counter, pq.size());
        }
        return counter;
    }
    public class Interval {
        int start, end;
        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
