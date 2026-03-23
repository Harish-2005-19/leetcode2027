class Solution {
    public String getPermutation(int n, int k) {
        ArrayList <Integer> number =new ArrayList<>();
        int fact=1;

        for(int i=1; i<=n;i++){
            number.add(i);
            fact*=i;
        }

        k--;
        StringBuilder result=new StringBuilder();

        for(int i=0;i<n; i++){
            fact/=(n-i);
            int index=k/fact;
            result.append(number.get(index));
            number.remove(index);
            k=k%fact;
        }
        return result.toString();
    }
}