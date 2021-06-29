
import java.util.Scanner;

public class tarea5 {

    public static void main(String args[]) {
        //Declaramos variable scanner
        Scanner scanner = new Scanner(System.in);
        //Declaramos variables a pedir al usuario
        //Pedimos al usuario que escriba el primer numero
        System.out.println("Proporciona el numero 1: ");
        int numero1 = Integer.parseInt(scanner.nextLine());
        //Pedimos al usuario que escriba el segundo numero
        System.out.println("Proporciona el numero 2: ");
        int numero2 = Integer.parseInt(scanner.nextLine());

        if (numero1 > numero2) {
            System.out.println("El numero mayor es: " + numero1);
        } else {
            System.out.println("El numero mayor es");
        }
        
        /*
        Segunda Opcion con operador ternario
        */
        
        System.out.println("Proporciona el numero 3:");
        int numero3 = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Proporciona el numero 4:");
        int numero4 = Integer.parseInt(scanner.nextLine());
        
        var resultado = (numero3 > numero4) ? ("El numero mayor es: " + numero3) : ("El numero mayor es: " + numero4);
        System.out.println(resultado);

    }

}
