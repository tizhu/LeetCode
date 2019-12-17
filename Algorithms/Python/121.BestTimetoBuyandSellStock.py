class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l = len(prices)
        minp = float("inf")
        maxp = 0
        for i in range(l):
            if prices[i]<minp:
                minp = prices[i]
            else:
                maxp = max(maxp, prices[i]-minp)
        return maxp