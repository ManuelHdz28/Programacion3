package ejercicio.pkg02;

public class NoPerecedero extends Producto{
    
    private String tipo;

    
    
    public String getTipo (){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public NoPerecedero(String tipo, String nombre, double precio) {
        super(nombre, precio);
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        return super.toString() + " tipo= " + tipo;
    }
    
}
