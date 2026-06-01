class Solution {
    public int digitFrequencyScore(int n) {
        int sum=0;
        while(n>0){
            int x = n%10;
            sum+=x;
            n/=10;
        }
        return sum;
    }
}