class Solution {
    public int maxWidthOfVerticalArea(int[][] p) {
        int n = p.length;
        int x[] = new int[n];
        for(int i=0;i<n;i++){
            x[i]=p[i][0];
        }
        Arrays.sort(x);
        int max=0;
        for(int i=1;i<n;i++){
            max=Math.max(max,x[i]-x[i-1]);
        }
        return max;
    }
}