import java.util.Stack;
public class Codigoclase {
    public static void main(String[] args) {
      String[] palabras = {"Warzone","Mundo","coco","intel","dios"};
      Stack <String> mip = new Stack<>();
      for (String palabritas : palabras) {
        mip.push(palabritas);
      }
      mip.push("Diablo");
      mip.push("Abuelo");
      System.out.println(mip.peek());
      mip.pop();
      System.out.println(mip);
      System.out.println(mip.isEmpty());
      
    }
    
}
