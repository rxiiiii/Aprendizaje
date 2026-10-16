import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaMenu {
    public static void main(String[] args) {
        Scanner opcion2 = new Scanner(System.in);
        int op = 0;
        while(op !=3){
            try{
                System.out.println("1. Productos");
                System.out.println("2.ver precio productos");
                System.out.println("3.Salir");
                op = opcion2.nextInt();
                if (op == 1){
                    System.out.println("!productos!");
                    System.out.println("Manzana");
                    System.out.println("frutilla");
                }else if( op == 2){
                    System.out.println("Manzana : 400$");
                    System.out.println("frutilla : 500$");
                }else if (op == 3){
                    System.out.println("Gracias por visitar esta pagina");
                    

                }else{
                    System.out.println("Eliga una opcion Correcta 1 2 3");
                }
            }catch(InputMismatchException e){
                opcion2.nextLine();
                System.out.println(" ! Error De Tipo !");
                
            }
        }
    }

}
