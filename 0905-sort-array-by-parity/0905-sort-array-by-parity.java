class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] % 2 > arr[right] % 2) 
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }

            if (arr[left] % 2 == 0) left++;
            if (arr[right] % 2 == 1) right--;
        }

        return arr;
    }
}
