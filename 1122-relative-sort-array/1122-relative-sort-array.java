class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] x = new int[arr1.length];
        int n = arr1.length;
        int m = arr2.length;
        int y = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(arr2[i] == arr1[j]) {
                    x[y++] = arr1[j];
                    arr1[j] = -1;
                }
            }
        }
        Arrays.sort(arr1);
        for(int i = 0; i < n; i++) {
            if(arr1[i] != -1) {
                x[y++] = arr1[i];
            }
        }
        return x;
    }
}