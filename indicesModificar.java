
import java.util.ArrayList;
import java.util.Scanner;

public class indicesModificar {

    public static void main(String[] args) {
        ArrayList<String>usuarios = new ArrayList<>();
        Scanner Modifi = new Scanner(System.in);
        usuarios.add("Ricardo");
        usuarios.add("Alonso");

        System.out.println("AGREGUE otro user");
        String userADD = Modifi.nextLine();
        usuarios.add(userADD);
        for(String i : usuarios){
            if(userADD.equals(i)){
                System.out.println(usuarios);
            }
        }
 



    }

}
