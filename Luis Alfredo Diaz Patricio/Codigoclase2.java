import java.util.LinkedList;
import java.util.Queue;
public class Codigoclase2 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        Queue<Integer> c = new LinkedList<>();
        for (int i : nums) {
            c.add(i);
        }
            c.add(11);
            c.add(12);
            System.out.println(c.peek());
            c.poll();
            System.out.println(c);
            System.out.println(c.isEmpty());
        }
    }
    
