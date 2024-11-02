class Solution {
    public static Comparator<Meeting> cmp = (a, b) -> {
        if (a.end != b.end) {
            return Integer.compare(a.end, b.end);
        }
        return Integer.compare(a.start, b.start);
    };
  public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        ArrayList<Meeting> meet = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
       for (int i = 0; i < N; i++) {
            meet.add(new Meeting(S[i], F[i], i + 1));
        }
        Collections.sort(meet, cmp);
        ans.add(meet.get(0).index);
        int endtime = meet.get(0).end;
        for (int i = 1; i < N; i++) {
            if (meet.get(i).start > endtime) {
                ans.add(meet.get(i).index);
                endtime = meet.get(i).end;
            }
        }
        Collections.sort(ans);
        return ans;
    }
    static class Meeting {
        int start;
        int end;
        int index;
        Meeting(int s, int e, int i) {
            this.start = s;
            this.end = e;
            this.index = i;
        }
    }
}
