import java.util.*;

public class Solution {
    static int findTheWinner(int n, int k) {
        if (n == 1)
            return 1;
        return (findTheWinner(n - 1, k) + k - 1) % n + 1;
    }
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int res = findTheWinner(n, k);
            System.out.println(res);
        }
    }
}
