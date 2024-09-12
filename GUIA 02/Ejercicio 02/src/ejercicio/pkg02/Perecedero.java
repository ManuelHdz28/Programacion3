package ejercicio.pkg02;


public class Perecedero extends Producto {
    
    private int diasCaduca;
    
    public Perecedero(int diasCaduca, String nombre, double precio) {
        super(nombre, precio);
        this.diasCaduca = diasCaduca;
    }
    
    public int getDiasCaduca(){
        return diasCaduca;
    }
    
    public void setDiasCaduca (int diasCaduca){
        this.diasCaduca = diasCaduca;
    }
    
    @Override
    public String toString(){
        return super.toString() + " diasCaduca = " + diasCaduca;
    }
    
    @Override
    public double calcularSubTotal (int cantidad){
        double precioActualizado = super.calcularSubTotal(cantidad);
        
        switch (diasCaduca){
            case 1:
                precioActualizado *= 0.2;
                break;
            case 2:
                precioActualizado *= 0.25;
                break;
            case 3:
                precioActualizado *= 0.5;
                break;
        }
        return precioActualizado;
    }
    
}
