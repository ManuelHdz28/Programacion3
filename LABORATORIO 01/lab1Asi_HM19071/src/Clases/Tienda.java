package Clases;

public class Tienda {
    
    protected int idTienda;
    protected String nombre;
    
    public Tienda (int idTienda, String nombre){
        this.idTienda = idTienda;
        this.nombre = nombre;
    }
    
    public int getIdTienda(){
        return idTienda;
    }
    public void setIdTienda (int idTienda){
        this.idTienda = idTienda;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return "[" + idTienda + "] " + nombre + " \n";
    }
    
    
}
