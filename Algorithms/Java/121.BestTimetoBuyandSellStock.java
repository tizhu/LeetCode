class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        
        int l = prices.length;
        
        for (int i=0;i<l;i++){
            if (prices[i]<min){
                min = prices[i];
            }else{max=Math.max(max,prices[i]-min);}
        }
        return max;
    }
}