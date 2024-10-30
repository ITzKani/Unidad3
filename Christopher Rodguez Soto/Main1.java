import java.util.Stack;
class Main1{
    public static void main(String[] args) {
        Persona p1=new Persona("Dagan", "Vega", 20);
        Persona p2=new Persona("Christopher", "Rodriguez",20);
        Persona p3=new Persona("Moises", "Ramirez",20);
        Persona p4=new Persona("Carlos", "Vazquez",26);
        Persona p5=new Persona("Alfredo", "Diaz",25);
        Stack<Persona> pila=new Stack<>();
        pila.push(p1); pila.push(p2); pila.push(p3); pila.push(p4); pila.push(p5);
        for( Persona p:pila){
            System.out.println(p.nombre +""+ p.apellido +""+ p.edad);
            

            }
        }

        
    }


