package Clases;

import Clases.Producto;


public class Ropa extends Producto{
    
    protected String talla;
    
    
    public Ropa(int idProducto, String nombre, int inventarios, String talla){
        super(idProducto, nombre, inventarios);
        this.talla = talla;
        
    }
    
    public String getTalla (){
        return  talla;
    }
    public void setTalla (String talla){
        if (!talla.equals("Z") || !talla.equals("z")) {
            this.talla = talla;
        } else {
            System.out.println("-> La talla no puede ser 'Z' o 'z'");
        }
    }
    
        
    
    public void venta(int candidad){
        inventarios = inventarios - candidad;
    }
    public void devolucion(int cantidad){
        inventarios = inventarios + cantidad;
    }
    
    
    public String toString(int cantidad){
        return super.toString() + " Talla: " + cantidad +  "";
    }
    
}
