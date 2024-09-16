package GrupoCaracol;

import  Clases.Electronico;
import  Clases.Producto;
import  Clases.Ropa;
import  Clases.Tienda;
import java.util.ArrayList;
import java.util.List;


public class Pruebas {
    public static void main(String[] args) {
        
        Tienda tienda1 = new Tienda(1, "Prisma Moda");
        Tienda tienda2 = new Tienda(2, "Siman");
        
        Ropa ropa1 = new Ropa(1000, "camisa", 30, "L");
        Ropa ropa2 = new Ropa(1001, "Pantalon", 20, "M");
        Ropa ropa3 = new Ropa(1002, "vestido", 20, "S");
        
        List<Ropa> ropaLista = new ArrayList<>();
        ropaLista.add(ropa1);
        ropaLista.add(ropa2);
        ropaLista.add(ropa3);
        
        Electronico electronico1 = new Electronico(2000, "audifonos", 40, 12);
        Electronico electronico2 = new Electronico(2001, "mouse", 20, 23);
        Electronico electronico3 = new Electronico(2002, "teclado", 20, 13);
        
        List<Electronico> electronicosLista = new ArrayList<>();
        electronicosLista.add(electronico1);
        electronicosLista.add(electronico1);
        electronicosLista.add(electronico3);
        
        ropa1.venta(4);
        ropa1.devolucion(1);
        ropa1.venta(6);
        ropa2.venta(9);
        ropa1.devolucion(4);
        ropa3.venta(4);
        
        electronico1.venta(5);
        electronico3.venta(10);
        electronico1.devolucion(2);
        electronico2.venta(2);
        electronico3.devolucion(3);
        electronico1.venta(1);
        
        System.out.println("\n TIENDAS: \n - " + tienda1 + " - " + tienda2);
        
        System.out.println("PRODUCTOS: \n");
        System.out.println("ROPA: \n");
        for (Ropa mostrarRopa: ropaLista){
            System.out.println("- " + mostrarRopa);
        }
        System.out.println("ELECTRONICOS: \n");
        for (Electronico mostrarElectronico : electronicosLista){
            System.out.println("- " + mostrarElectronico);
        }
        
    }
}
