class Solution {

    public List<Integer> largestDivisibleSubset(int[] nums) {

        int n = nums.length;

        Arrays.sort(nums);

        int[] dp = new int[n];
        int[] parent = new int[n];

        Arrays.fill(dp, 1);

        int maxLength = 0;
        int lastIdx = 1;

        for(int i = 0; i < n; i++){

            parent[i] = i;

            for(int j = 0; j < i; j++){

                if(nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1){

                    dp[i] = dp[j] + 1;
                    parent[i] = j;

                }
            }

            if(maxLength < dp[i]){

                maxLength = dp[i];
                lastIdx = i;

            }
        }

        List<Integer> list = new ArrayList<>();

        list.add(nums[lastIdx]);

        while(parent[lastIdx] != lastIdx){

            lastIdx = parent[lastIdx];
            list.add(nums[lastIdx]);

        }

        Collections.reverse(list);

        return list;
    }
}