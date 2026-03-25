class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();

        int opncount = 0;

        for(int i = 0 ;i<n ; i++){
            char c = s.charAt(i);
            if(c == '('){
                opncount++;
                ans.append(c);
            }else if(c == ')'){
                if(opncount > 0){
                    opncount--;
                    ans.append(c);
                }
            }else{
                ans.append(c);
            }
        }

        StringBuilder ans2 = new StringBuilder();
        int extracnt = opncount;
        
        String S = ans.toString();

        for(int i = S.length() -1 ; i >= 0 ; i--){
            char c = S.charAt(i);
            if(c == '(' && extracnt > 0){
                extracnt--;
                continue;
            }
            ans2.append(c);
        }

        return ans2.reverse().toString();
    }
}