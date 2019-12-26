class Solution {
    public String convert(String s, int numRows) {
        Map<Integer, StringBuilder> hmap = new HashMap<>();
        StringBuilder res = new StringBuilder();
        int pos = 0;
        boolean incr = true;
        for (char c: s.toCharArray()){
            if (pos == numRows) incr = false;
            if (pos == 1) incr = true;
            if (incr) pos++; else pos--;
            if(!hmap.containsKey(pos)){
                hmap.put(pos, new StringBuilder());
            }
            hmap.get(pos).append(c);
            // System.out.println(pos);
        }

        for (int i: hmap.keySet()){
            res.append(hmap.get(i));
        }
        return res.toString();
    }
}