class Solution {
    public String truncateSentence(String s, int k) {
        String [] str = s.split(" ");
        String res = "";
        for(int i=0;i<k;i++){
            res+=str[i];
            if(i<k-1)
                res+=" ";
        }
        return res;
    }
}