class Solution {
    public void duplicateZeros(int[] arr) {
        int len = arr.length;
        for (int i =0;i<len;i++) {
            if (arr[i] == 0 && i+1<len) {
                for (int j = len-1;j>i+1;j--) 
                    arr[j] = arr[j-1];
                arr[i+1] = 0;
                i++;
            }
        }
    }
}