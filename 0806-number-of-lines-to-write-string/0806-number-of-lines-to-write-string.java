class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        char c[]=s.toCharArray();
        int sum=0,l=0,px=0;
        int res[]=new int [2];
        for(char k:c){
            int r=k-'a';
            if(sum+widths[r]>100){
                sum=0;
                l++;
            }
            sum+=widths[r];
        }
        if(sum!=0) res[0]=l+1;
        else res[0]=l;
        res[1]=sum;
        return res;
    }
}