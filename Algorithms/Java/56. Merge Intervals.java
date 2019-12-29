import java.util.List;

class Solution{
    public int[][] merge(int[][] intervals){
        List<int[]> res = new ArrayList<>();
        if (intervals.length<=1) return intervals;
        Arrays.sort(intervals,(arr1,arr2)->Integer.compare(arr1[0],arr2[0]));
        int s = intervals.length;
        int[] currentInterval = intervals[0];
        res.add( currentInterval);
        for (int i=1; i<s; i++){
            if (currentInterval[1]>=intervals[i][0]){
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            }else {
                currentInterval = intervals[i];
                res.add(currentInterval);}
        }
        return res.toArray(new int[res.size()][]);
    }
}