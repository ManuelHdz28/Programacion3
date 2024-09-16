package Clases;


public class Producto {
    
    protected int idProducto;
    protected String nombre;
    protected int inventarios;
    
    public Producto (int idProducto, String nombre, int inventarios) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.inventarios = inventarios;
    }
    
    public int getIdProducto(){
        return idProducto;
    }
    public void setIdProducto (int idProducto){
        this.idProducto = idProducto;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public int getInventarios(){
        return idProducto;
    }
    public void setInventarios (int inventarios){
        this.inventarios = inventarios;
    }
    
    @Override
    public String toString(){
        return "[" + idProducto + "] " + nombre + " Candidad: " + inventarios + " \n";
    }
    
}
