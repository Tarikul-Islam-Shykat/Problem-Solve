class Solution {
  int eraseOverlapIntervals(List<List<int>> intervals) {
    int count = 0;
  intervals.sort((a,b) => a[1].compareTo(b[1]));
  int lastEnd = intervals[0][1];
  for(int i = 1 ; i<intervals.length; i ++){
    if(intervals[i][0] < lastEnd ){
      count ++;
    } else {
      lastEnd = intervals[i][1];
    }
  }
  return count;
  }
}
