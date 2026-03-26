class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
		boolean[] n = new boolean[nums.length+1];
		for(int num : nums) {
			n[num] = true;
		}
		
		for(int i=1; i<=nums.length; i++) {
			if(!n[i]) result.add(i);
		}
        return result;
    }
}