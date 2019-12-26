class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> res = new ArrayList<>();

        if (candidates == null || candidates.length == 0) return res;
        
        Arrays.sort(candidates);
        
        List<Integer> combinations = new ArrayList<>();

        findUniqueCombination(res, candidates, target, 0, combinations);

        return res;        
    }

    public void findUniqueCombination(List<List<Integer>> res, int[] candidates, int target, int startIndex, List<Integer> combinations){

        if (target == 0) {
            res.add(new ArrayList<>(combinations));
            return;
        }

        if (target < 0) return;

        
        for (int i=startIndex; i<candidates.length; i++){

            if (i!=startIndex && candidates[i]==candidates[i-1]) continue;

            if (candidates[i]>target) break;

            combinations.add(candidates[i]);

            findUniqueCombination(res, candidates, target-candidates[i], i+1, combinations);

            combinations.remove(combinations.size()-1);
        }
    }
}