class Solution {
    private void getcomb(int[] nums, int i, int t, List<Integer>cur, List<List<Integer>> res){
        if(t == 0){
            res.add(new ArrayList<Integer>(cur));
            return;
        }
        if(t < 0 || i >= nums.length) return;
        for(int k = i ; k < nums.length; k++){
            cur.add(nums[k]);
            getcomb(nums, k, t-nums[k], cur, res);
            cur.remove(cur.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        getcomb(candidates, 0, target, new ArrayList<>(), res);
        return res;
    }
}