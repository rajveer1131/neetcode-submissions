/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
       intervals.sort((a,b) -> a.start-b.start);
       if(intervals.size()==0 || intervals.size()==1)return true;
        int current=intervals.get(0).end;
        for(int i=1;i<intervals.size();i++){
        System.out.println(current);
            if(current>intervals.get(i).start){
                return false;
            }else{
                current=intervals.get(i).end;
            }
            
        }
       return true;
    }
}
