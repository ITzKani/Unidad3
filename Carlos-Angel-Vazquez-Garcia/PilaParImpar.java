import java.util.Stack;
class PilaParImpar{
    public static void main(String[] args) {
        Stack<Integer> pilaImpar= new Stack<Integer>();
        Stack<Integer> pilaPar= new Stack<Integer>();

        for (int i = 0; i <= 30; i++){
            if(i%2==0){
                pilaPar.push(i);
            }
            else{
                pilaImpar.push(i);
            }
        }
        System.out.println(pilaImpar);
        System.out.println(pilaPar);
        }
    }
