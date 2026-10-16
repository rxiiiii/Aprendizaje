public class cajero {
    public static void main(String[] args) {
        int CantidadProductos = 3;
        double producto = 5000.0;
        double descuento = 0.10;
        double dineroCliente = 16000.0;
        double resultado = producto * CantidadProductos;
        double finall = resultado * descuento;
        double finalll = resultado - finall;

        if(dineroCliente >= finalll){
            double suf = dineroCliente - finalll ;
            System.out.println("La compra a sido exitosa su vuelto es de : " + suf);
        }else{
            System.out.println("la compra no se puede realizar");
        }  
    }
}
