import java.util.Scanner;
public class menu1 {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3){
            System.out.println("1. Productos");
            System.out.println("2.ver precio productos");
            System.out.println("3.Salir");
            int opcionMenu = menu.nextInt();
            if (opcionMenu == 1){
                System.out.println("!productos!");
                System.out.println("Manzana");
                System.out.println("frutilla");
            }else if( opcionMenu == 2){
                System.out.println("Manzana : 400$");
                System.out.println("frutilla : 500$");
            }else if (opcionMenu == 3){
                System.out.println("Gracias por visitar esta pagina");
                opcion = 3;
            }
        }
        menu.close();
        
    }

}
