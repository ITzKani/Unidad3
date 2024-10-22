import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class ColaNombre {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Dame tu primer nombre:");
      String name = sc.nextLine();

      Queue<String> c = new LinkedList();
      for(int i = 0; i < name.length(); i++) {
         c.add(String.valueOf(name.charAt(i)));
      }

      System.out.println(c);
   }
}