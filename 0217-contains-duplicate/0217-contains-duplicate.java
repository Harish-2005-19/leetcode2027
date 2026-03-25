class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> m = new HashSet<>();
        for(int n : nums){
            m.add(n);
        }        
        if(m.size() == nums.length){
            return false;
        }
        return true;
    }
}