class Solution {
    public int search(int[] arr, int t) {
        int s = 0;
        int e = arr.length - 1;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(arr[mid]==t)
                return mid;
            else if(arr[mid]>t)
                e = mid - 1;
            else
                s= mid + 1;
        }
        return -1;
    }
}