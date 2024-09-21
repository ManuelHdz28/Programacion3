package Clases;


public class VideoJuego {
    
    // Propiedades 
    private int id;
    private String nombre;
    private double precio;
    private int disponible;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }
    
    public void VideoJuego(){
        
    }
    
    public void AgregarVideoJuego(){
        System.out.println("Clases.VideoJuego.AgregarVideo(): VideoJuego Agregado");
    }

    @Override
    public String toString() {
        return this.nombre; 
    }
    
    
    
    
}
