
import java.util.Scanner;
public class primeroScanner {
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe tu edad");
        int edad = entrada.nextInt();
        
        System.out.println("Tu edad es de : " + edad);

        entrada.close();
        
    }

}
