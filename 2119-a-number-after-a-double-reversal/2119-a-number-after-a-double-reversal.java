class Solution {
    public boolean isSameAfterReversals(int num) {
        int y=num;
        int sum=0;
        int x=0;
        while(num>0)
        {
            int d=num%10;
            sum=sum*10+d;
            num=num/10;
        }
        while(sum>0)
        {
            int d=sum%10;
            x=x*10+d;
            sum=sum/10;
        }

        if(y==x)
        {
            return true;
        }
        return false;
    }
}