import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        ArrayList<String> usuarios = new ArrayList<>();
        Scanner agregarNombre = new Scanner(System.in);
        Scanner verNombre = new Scanner(System.in);
        Scanner opciones = new Scanner(System.in);
        boolean salirrS = false;

        int op;

        do {
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
                        Scanner usuarVer = new Scanner(System.in);
                        if(!salirrS){
                            System.out.println("Error: No tiene Usuarios Agregados ! ");
                        }else{
                            String nombreVer = verNombre.nextLine();
                            for(String buscarN : usuarios){
                                if(nombreVer.equals(buscarN)){
                                    System.out.println(nombreVer);
                                    System.out.println("Quiere ver todos los usuarios que tiene?");
                                    String verll = usuarVer.nextLine();
                                    if(verll.equals("si")){
                                        System.out.println("sus usuarios son : " + usuarios);
                                    }else{
                                        System.out.println("adios hasta la proxima ! ");
                                    }
                                }
                            }break;
                        }
                    case 3:
                        if(!salirrS){
                            System.out.println("no existen usuarios para modificar ! ");
                        }else{
                            while(true){
                                System.out.println("Escriba el Usuario que quiere modificar ! ");
                                Scanner modiusuR = new Scanner(System.in);
                                String modificarUsuar = modiusuR.nextLine();
                                for(String buscarModificar : usuarios){
                                    if(modificarUsuar.equals(buscarModificar)){
                                        Scanner cambiarNombre = new Scanner(System.in);
                                        String usuarioCambiar = cambiarNombre.nextLine();
                                        
                                        
                                    }else{
                                        System.out.println("Usuario no encontrado ! ");
                                    }
                                }
                            }
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