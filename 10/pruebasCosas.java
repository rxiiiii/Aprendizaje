import java.util.Scanner;
public class pruebasCosas {
    
    public static void main(String[] args) {
        Scanner prueba1 = new Scanner(System.in);
        int intentos = 3;
        while (intentos != 0){
            System.out.println("Ingrese texto ! ");
            String texto = prueba1.nextLine();
            if(!texto.equals("ricardo")){
                --intentos;
                System.out.println("intentos restantes : "+intentos);
            }else if (intentos <= 0 || intentos == 0) {
                System.out.println("Error:");
                break;
                
            }else{
                System.out.println("nombre correcto ");
                break;
            }

            
            
            

        }

        
        



    }
    

}
