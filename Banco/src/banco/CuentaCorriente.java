package banco;

import java.util.ArrayList;


public class CuentaCorriente {
    
    //ATRIBUTOS DE LA CLASE CUENTA CORRIENTE
    
    private String numero = "";
    private double  saldo;
    private String nombre;
    private String telefono;
    private ArrayList<String> movimientos = new ArrayList<String> ();
    
    
    //CONSTRUCTOR SIN PARAMETROS
    public CuentaCorriente(){
        this.generarNumero();
    }
    
    public CuentaCorriente(String nombre, String telefono, double saldo){
    
        this.generarNumero();
        this.saldo = saldo;
        this.nombre = nombre;
        this.telefono = telefono;
        
    }
    
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo (double saldo){
        this.saldo = saldo;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public ArrayList<String> getMovimientos(){
        return movimientos;
    }
    public void setMovimientos(ArrayList<String> movimientos){
        this.movimientos = movimientos;
    }
    
    // METODO QUE GENERA UN NUMERO ALEATORIO QUE SE ASIGNA AL ATRIBUTO NUMERO
    private void generarNumero(){
        for (int i = 0; i < 10; i++) {
            numero += (int) (Math.random() * 10);
        }
    }
    
    @Override
    public String toString(){
        return "Numero de cta: " + numero + " Saldo: $" + String.format("%.2f", saldo);
    }
    
    // METODO PARA ABONAR DINERO A UNA CUENTA. EL MOVIMIENTO SE GUARDE EN LA COLECCION.
    void abono(int dinero){
        saldo += dinero;
        movimientos.add("Abonos de $" + dinero + " Saldo: $" + String.format("%.2f", saldo));
    }
    
    // METODO PARA SACAR DINERO DE UNA CUENTA. EL MOVIMIENTO SE GUARDA EN LA COLECCION.
    void cargo(int dinero){
        saldo -= dinero;
        movimientos.add("Cargo de $" + dinero + " Saldo: $" + String.format("%.2f", saldo));
    }
    
    // METODO PARA TRANSFERIR DINERO DE UNA CUENTA A OTRA. EL MOVIMIENTO SE GUARDA EN LA COLECCION
    void transferencia(CuentaCorriente cuentaDestino, int dinero){
        saldo -= dinero;
        cuentaDestino.saldo += dinero;
        movimientos.add("Transf. emitida de $" + dinero + " a la cuenta " + cuentaDestino.numero + " Saldo: $" + String.format("%.2f", saldo));
        cuentaDestino.movimientos.add("Transf. emitida de $" + dinero + " de la cuenta " + cuentaDestino.numero + " Saldo: $" + String.format("%.2f", cuentaDestino.saldo));
    }
    
    // METODO QUE LISTA TODOS LOS MOVIMIENTOS QUE SE HICIERON EN UNA CUENTA
    void movimientos(){
        System.out.println("!*************************************!");
        System.out.println("Movimientos de la Cuenta " + numero);
        System.out.println("Cuenta a nombre de: " + nombre);
        System.out.println("Telefono: " + telefono);
        System.out.println("---------------------------------------");
        for (String movimiento : movimientos) {
            System.out.println(movimiento);
        }
    }
    
}
