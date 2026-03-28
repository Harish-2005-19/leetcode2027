import java.util.Scanner;

class Solution
{
    static boolean isvowel(char c)
    {
        return(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
    }
    static String reverseVowels(String s)
    {
        char c[] = s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            while(left<right&&!isvowel(c[left]))
            {
                left++;
            }
            while(left<right&&!isvowel(c[right]))
            {
                right--;
            }
            char temp = c[left];
            c[left]=c[right];
            c[right]=temp;
            left++;
            right--;
        }
        return new String(c);
    }
}