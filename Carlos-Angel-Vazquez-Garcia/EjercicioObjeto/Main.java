import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Persona> personas = new ArrayList<Persona>();
        String setNombre, setApellido;
        int setEdad, id=0;
        do {
            System.out.println("Escriba el nombre de la persona:");
            setNombre = sc.nextLine();
            System.out.println("Escriba el apellido de la persona:");
            setApellido = sc.nextLine();
            System.out.println("Escriba la edad de la persona:");
            setEdad = sc.nextInt();
            personas.add(id, new Persona(setNombre, setEdad, setApellido));
            id++;
        } while (personas.size() <=2);
        for (int i=0; i<personas.size(); i++) {
            if (personas.get(i).getNombre().equals("Kilo")) {
                personas.remove(i);
                break;
            }
            for (int j=0; j<personas.size(); j++) {
                System.out.println("Persona " + (i+1));
                System.out.println(personas.get(i).mostrarPersona());
                }
            }
        }
    }