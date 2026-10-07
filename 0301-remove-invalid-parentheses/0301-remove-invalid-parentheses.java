import java.util.*;

class Solution {
    public List<String> removeInvalidParentheses(String s) {

        List<String> ans = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        Set<String> set = new HashSet<>();

        q.add(s);
        set.add(s);

        boolean found = false;

        while (!q.isEmpty() && !found) {

            int size = q.size();

            while (size-- > 0) {

                String x = q.poll();

                if (valid(x)) {
                    ans.add(x);
                    found = true;
                    continue;
                }

                for (int i = 0; i < x.length(); i++) {

                    if (x.charAt(i) == '(' || x.charAt(i) == ')') {

                        String next = x.substring(0, i) + x.substring(i + 1);

                        if (set.add(next))
                            q.add(next);
                    }
                }
            }
        }

        return ans;
    }

    boolean valid(String s) {

        int count = 0;

        for (char c : s.toCharArray()) {

            if (c == '(')
                count++;
            else if (c == ')')
                count--;

            if (count < 0)
                return false;
        }

        return count == 0;
    }
}