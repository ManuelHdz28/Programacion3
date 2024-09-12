package ejercicio.pkg02;

import java.util.ArrayList;
import java.util.List;


public class Prueba {
    public static void main(String[] args) {
       
        List<Producto> listaProductos = new ArrayList<>();
        
        listaProductos.add(new Producto("General", 15));
        listaProductos.add(new Perecedero(2, "Perecedero", 20));
        listaProductos.add(new NoPerecedero("Tipo Materiales", "No Perecedero", 10));
        
        double total = 0;
        double subTotal = 0;
        
        for (Producto producto : listaProductos) {
            subTotal = producto.calcularSubTotal(3);
            total += subTotal;
            System.out.println(producto.toString() + ", SubTotal = " + subTotal);
        }
        System.out.println("El total es = " + total);
    } 
}
