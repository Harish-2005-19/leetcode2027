class Solution {
    Set<List<Integer>> lst;

    public void create(int[] nums, int pos, List<Integer> list, int[] visited) {
        visited[pos] = 1;
        list.add(nums[pos]);

        if (list.size() == nums.length) {
            lst.add(list);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 1) {
                continue;
            }
            create(nums, i, new ArrayList<>(list), visited);
            visited[i] = 0;
        }

        visited[pos] = 0;
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        lst = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            create(nums, i, new ArrayList<>(), new int[nums.length]);
        }

        return lst.stream().map(a -> a).toList();
    }
}