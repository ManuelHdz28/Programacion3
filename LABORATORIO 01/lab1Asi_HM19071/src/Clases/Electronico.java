package Clases;

import Clases.Producto;

public class Electronico extends Producto {
    
    protected int garantia;
    
    
    public Electronico(int idProducto, String nombre, int inventarios,int garantia){
        super(idProducto, nombre, inventarios);
        this.garantia = garantia;
        
    }
    
    public int getGarantia (){
        return  garantia;
    }
    public void setGarantia (int garantia){
        if (garantia <= 12) {
            this.garantia = garantia;
        } else {
            System.out.println("-> La garantía tiene que ser menor aa 12 meses.");
        }
    }
    
    
    
    public void venta(int candidad){
        inventarios = inventarios - candidad;
    }
    public void devolucion(int cantidad){
        inventarios = inventarios + cantidad;
    }
    
    
    public String toString(int cantidad){
        return super.toString() + " Garantia :" + cantidad +  " meses.";
    }
    
}
