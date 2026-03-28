import java.util.*;

public class Solution {
    public static boolean isvowel(char ch)
    {
        return(ch=='a' || ch=='e' || ch=='i'||ch=='o' || ch=='u');
    }
    static int maxVowels(String s,int k)
    {
        int max=0;
        int v=0;
        for(int i=0;i<s.length();i++)
        {
            if(isvowel(s.charAt(i)))
                v++;
            if(i>=k)
            {
                if(isvowel(s.charAt(i-k)))
                    v--;
            }
            max=Math.max(max,v);
        }
        return max;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(maxVowels(s,k));
    }
}