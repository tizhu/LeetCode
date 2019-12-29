class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        s = len(intervals)
        if s <= 1: return intervals
        intervals = sorted(intervals, key=lambda x: x[0])
        
        currentInterval = intervals[0]
        res = [currentInterval]

        for i in range(1,s):
            if currentInterval[1] >= intervals[i][0]:
                currentInterval[1] = max(currentInterval[1], intervals[i][1])
            else: 
                currentInterval = intervals[i]
                res.append(currentInterval)
        
        return res
