import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        ArrayList<String> usuarios = new ArrayList<>();
        Scanner agregarNombre = new Scanner(System.in);
        Scanner modificarNombre = new Scanner(System.in);
        Scanner opciones = new Scanner(System.in);

        int op;

        do {
            boolean salirrS = false;
            System.out.println("Gestor Para Agregar Alumnos modificar y eliminar");
            System.out.println("Seleccione una de las opciones:");
            System.out.println("1. Agregar usuario");
            System.out.println("2. Ver usuario");
            System.out.println("3. Modificar Usuarios");
            System.out.println("4. Borrar Usuario");
            System.out.println("5. Salir");
            System.out.println("");

            op = opciones.nextInt();

            if (op < 1 || op > 5) {
                System.out.println("Error: Debe ser una opcion entre 1 al 5!");
            } else {
                switch (op) {
                    case 1:
                        while (true) {
                            boolean tieneNumero = false;
                            boolean tieneCaracter = false;
                            Scanner salirse = new Scanner(System.in);

                            String AgregarN = agregarNombre.nextLine();

                            for (int i = 0; i < AgregarN.length(); ++i) {
                                if (Character.isDigit(AgregarN.charAt(i))) {
                                    System.out.println("Error: No puede ser un digito");
                                    tieneNumero = true;
                                }
                            }

                            for (int i = 0; i < AgregarN.length(); ++i) {
                                if (!Character.isLetterOrDigit(AgregarN.charAt(i))) {
                                    System.out.println("No debe contener un Simbolo Especial!");
                                    tieneCaracter = true;
                                }
                            }

                            if (!tieneCaracter && !tieneNumero) {
                                usuarios.add(AgregarN);
                                System.out.println("Quiere salir? s/n");

                                String salirS = salirse.nextLine();

                                if (salirS.equals("s")) {
                                    salirrS = true;
                                }
                            }

                            if (salirrS) {
                                System.out.println("Acaba de salir de agregar Usuarios");
                                break;
                            }
                        }
                        break;

                    case 2:
                        if(!salirrS){
                            System.out.println("Error: No tiene Usuarios Agregados ! ");
                        }else{
                            
                        }

                    default:
                        break;
                }

            }

        } while (op != 5);

        agregarNombre.close();
        opciones.close();
    }
}