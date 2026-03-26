class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int nextGreter ;
        boolean match ;
        for(int i = 0 ; i < nums1.length ; i ++){
            match = false ;
            nextGreter = -1 ;
            for(int j = 0 ; j < nums2.length ; j++){
                if(nums2[j] == nums1[i]){
                    match = true ;
                }

                if(match && nums2[j] > nums1[i])
                {
                    if(nextGreter == -1){
                        nextGreter = nums2[j];
                    }
                }
            }
            nums1[i] = nextGreter;
        }

        return nums1 ;
    }
}