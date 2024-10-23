import java.util.LinkedList;
import java.util.Queue;
class ColaNumero {
    public static void main(String[] args) {
        Queue<Integer> c= new LinkedList<>();
        int[] ar={1,2,3,4,5,6,7,8,9,10};
        for(Integer numero : ar){
            c.add(numero);
        }
        c.add(11);
        c.add(12);
        System.out.println(c.peek());
        c.remove(12);
        System.out.println(c);
        System.out.println(c.isEmpty());
    }
}
