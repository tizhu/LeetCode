class Solution {
    public String convertToTitle(int n) {
        StringBuilder res = new StringBuilder();
        
        while(n>0){
            n--;
            char toAdd = (char)(n%26+65); 
            res.insert(0,toAdd);
            n/=26;
        }
        
        return res.toString();
        
    }
}