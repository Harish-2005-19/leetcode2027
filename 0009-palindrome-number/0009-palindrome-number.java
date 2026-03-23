class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int r = 0;
        int  n= x;

        while (n!= 0) {
            r= r*10 + n%10;
            n=n/10;
        }

        return (r == x);
    }
}