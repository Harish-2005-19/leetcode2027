class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x = nums1.length;
        int y = nums2.length;
        int k=x+y;
        int m[] = new int[k];
        int n=0;
        for(int i=0;i<x;i++)
            m[n++]=nums1[i];

        for(int i=0;i<y;i++)
            m[n++]=nums2[i];

        Arrays.sort(m);
        int t=m.length;
        if(t%2==1)
            return(double) m[t/2];

        else
        {
            int m1=m[t/2 - 1];
            int m2=m[t/2];
            return (m1+m2)/2.0;
        }
    }
}