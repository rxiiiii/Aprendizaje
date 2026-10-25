import  java.util.Scanner;

public class Pruebarut {
    /*una empresa tiene un problema no saben como hacer que se pueda poner de manera correcta el rut necesitan estos 4 requerimientos
    necesitan que el rut tenga 9 caracteres, tambien debe contener si o si un (-) tambien no debe contener . y tambien no puede ser valor vacio */
    public static void main(String[] args) {
        Scanner rutt = new Scanner(System.in);

        String rut = rutt.nextLine();

        if(!rut.contains("-")){
            System.out.println("Error: Debe contener un guion");
        }else if(rut.contains(".")){
            System.out.println("Error: No debe contener ( . )");
        }

        

       




        



    }


}
