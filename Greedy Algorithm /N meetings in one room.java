class Solution {
    public static Comparator<Meeting> cmp = (a,b) -> Integer.compare(a.end,b.end);
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int n=start.length;
        List<Meeting> meet = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            meet.add(new Meeting(start[i],end[i]));
        }
        Collections.sort(meet,cmp);
        int count=1;
        int endtime=meet.get(0).end;
        for(int i=1;i<n;i++)
        {
            if(meet.get(i).start>endtime)
            {
                count++;
                endtime=meet.get(i).end;
            }
        }
        return count;
        
    }
    class Meeting{
        int start;
        int end;
        Meeting(int s,int e){
            this.start=s;
            this.end=e;
        }
    }
}
