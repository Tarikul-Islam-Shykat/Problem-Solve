class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int lastEnd = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] < lastEnd)
            {
                count++;
            }else {
                lastEnd = intervals[i][1];
            }
        }
        
        return count;
    }
}
