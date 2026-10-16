import java.util.InputMismatchException;
import java.util.Scanner;
public class SistemaDeEdad {
    public static void main(String[] args) {
        Scanner manejoSistema = new Scanner(System.in);
        int controladorEdad = -1;
        while (controladorEdad < 0){
            try{
                controladorEdad = manejoSistema.nextInt();
                if (controladorEdad >= 18){
                    System.out.println("Acceso Aceptado uste es mayor de edad");
                }else if(controladorEdad <= 0){
                    System.out.println("ERROR: el dato no puede ser 0 ni numero negativo");
                }
            }catch(InputMismatchException e){
                System.out.println("Error De tipo De Dato !");
                manejoSistema.nextLine();

            }
        }
        manejoSistema.close();
    }

}
