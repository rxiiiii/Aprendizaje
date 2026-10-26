
import java.util.ArrayList;
import java.util.Scanner;



public class indicesModificar {
  public static void main(String[] args) {
        ArrayList<String>usuarios = new ArrayList<>();
        int indices = -1;
        Scanner usuariosAgregar =  new Scanner(System.in);
        String agregarUsuarios = usuariosAgregar.nextLine();
        usuarios.add(agregarUsuarios);
        usuarios.add("Ricardo");
        int ii = -1;
        for(int i = 0; i < usuarios.size(); ++i){
            ii++;
            System.out.println(usuarios.get(i)+ " : " + ii);
        }

        
        
    
   } 
}