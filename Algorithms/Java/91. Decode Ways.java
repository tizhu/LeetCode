class Solution {
    public int numDecodings(String s) {
        int l = s.length();
        int[] res = new int[l+1];

        res[0] = 1;
        res[1]  = s.charAt(0)=='0'?0:1 ;
        for (int i=2;i<=l;i++){
            int oneD = Integer.valueOf(s.substring(i-1, i));
            int twoD = Integer.valueOf(s.substring(i-2, i));

            if (oneD>=1) res[i] += res[i-1];
            if (twoD>=10 && twoD<=26) res[i] += res[i-2];
        }
        return res[l];
        
    }
}