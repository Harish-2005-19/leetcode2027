import java.util.*;
import java.util.LinkedList;
class RecentCounter{
    Queue<Integer> q;
    public RecentCounter(){
        q= new LinkedList<>();
    }
    public int ping(int t){
        q.offer(t);
        while(!q.isEmpty() && q.peek()<t-3000){
            q.poll();
        }
        return q.size();
    }
}
public class Recentqueue {
    public static void main(String[] args){
        RecentCounter rc = new RecentCounter();
        System.out.println(rc.ping(1));
        System.out.println(rc.ping(100));
        System.out.println(rc.ping(3001));
        System.out.println(rc.ping(3002));
    }
}
