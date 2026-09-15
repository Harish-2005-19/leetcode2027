class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>(rowIndex + 1);
        res.add(1);
        long p = 1;
        for(int k = 1; k <= rowIndex; k++){
            long curr = p * (rowIndex - k + 1) / k;
            res.add((int) curr);
            p = curr;
        }
        
        return res;
    }
}