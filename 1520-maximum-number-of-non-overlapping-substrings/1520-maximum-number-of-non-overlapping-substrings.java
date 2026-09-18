class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int n=s.length();
        int[][] letters=new int[26][2];
        for(int row[]:letters){
            Arrays.fill(row,-1);
        }
        for(int i=0;i<n;i++){
            int c=s.charAt(i)-'a';
            if(letters[c][0]==-1) letters[c][0]=i;
            letters[c][1]=i;
        }
        List<int[]> intervals=new ArrayList<>();
        for(int it[]:letters){
            int start=it[0];
            int end=it[1];
            if(start==n+1 || end==-1) continue;
            boolean flag=true;
            for(int j=start;j<=end;j++){
                int mid=s.charAt(j)-'a';
                int si=letters[mid][0];
                if(si<start){
                    flag=false;
                    break;
                }
                else end=Math.max(end,letters[mid][1]);
            }
            if(flag) intervals.add(new int[]{start,end});
        }
        Collections.sort(intervals,(x,y)->x[1]-y[1]);
        List<String> ans=new ArrayList<>();
        int last=-1;
        for(int i=0;i<intervals.size();i++){
            int start=intervals.get(i)[0];
            int end=intervals.get(i)[1];
            if(end==-1) continue;
            if(start>last){
                ans.add(s.substring(start,end+1));
                last=end-1;
            }
        }
        return ans;
    }
}