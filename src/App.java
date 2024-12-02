import models.Persona;
import models.genericos.Caja;
import models.genericos.Par;

public class App {
    public static void main(String[] args) throws Exception{
        
        /*Caja<String> cajaString = new Caja<>();
        Caja<Integer> cajaInteger = new Caja<>();
        Caja<Persona> cajaPersona = new Caja<>();

        Persona persona = new Persona();
        persona.setNombre("Edu");
        persona.setEdad(22);
        cajaPersona.guardar(persona);
        
        cajaString.guardar("guardar un string");
        cajaInteger.guardar(10);
        System.out.println(cajaString.obtener());
        System.out.println(cajaInteger.obtener());
        System.out.println(cajaPersona.obtener()); //Se imprime la persona
        
        Par<String, Integer> par = new Par<>();
        */

        System.out.println("\n------------------PRACTICA------------------");

        Persona[] personas = new Persona[10];
        System.out.println("Arreglo de 10 personas");
        personas[0] = new Persona("Luis", 32);
        personas[1] = new Persona("Juan", 14);
        personas[2] = new Persona("Edu", 16);
        personas[3] = new Persona("Aleks", 17);
        personas[4] = new Persona("Isacc", 18);
        personas[5] = new Persona("Jhon", 19);
        personas[6] = new Persona("Cris", 24);
        personas[7] = new Persona("Dani", 10);
        personas[8] = new Persona("Belen", 9);
        personas[9] = new Persona("Ale", 20);

        for (Persona persona : personas) {
            System.out.println(persona);
        }
        
        Par<String, Integer> [] mayoresEdad = new Par[10];
        Par<Integer, String> [] menoresEdad = new Par[10];

        int mayores = 0;
        int menores = 0;

        for (Persona persona : personas) {
            if (persona.getEdad() >= 18) {
                mayoresEdad[mayores] = new Par<>(persona.getNombre(), persona.getEdad());
                mayores++;
                }else{
                    menoresEdad[menores] = new Par<>(persona.getEdad(), persona.getNombre());
                    menores++;
                }
            }
            
            System.out.println("mayores de Edad");
            for (int i = 0; i < mayores; i++) {
                System.out.println(mayoresEdad[i]);
            }

            System.out.println("menores de Edad");
            for (int i = 0; i < menores; i++) {
                System.out.println(menoresEdad[i]);
        }
    }
}
