public class cajero3 {

    public static void main(String[] args) {
        int cantidadProductos = 3;
        double precioUnitario = 5000.0;
        double subtotal = cantidadProductos * precioUnitario;
        double descuento = subtotal * 0.10;
        double precioFinal = subtotal - descuento;
        double dineroCliente = 16000.0;
        boolean clienteActivo = true;
        if(cantidadProductos <= 0){
            System.out.println("la cantidad del producto esta mal no puede ser negativa");
        }else if (!clienteActivo  ){
            System.out.println("el cliente debe de estar activo");
        }else if (dineroCliente < precioFinal){
            System.out.println("No tiene el dinero suficiente");
        }else{
            System.out.println("compra exitosa");
        }
    }
}
