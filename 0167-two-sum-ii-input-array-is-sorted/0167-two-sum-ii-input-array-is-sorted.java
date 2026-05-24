class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0;
        int j = n - 1;

        while( i < j ) {
            int sum = numbers[i] + numbers[j];
            
            if( sum == target ) {
                return new int[]{ i + 1, j + 1 };
            }
            else if( sum > target ) {
                j -= 1;
            }
            else{
                i += 1;
            }
        }

        return new int[]{ -1, -1 };

    }
}