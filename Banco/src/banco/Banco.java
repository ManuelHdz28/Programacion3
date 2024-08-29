package banco;


public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       //DECLARANDO OBJETOS DE TIPO CuentaCorriente
       CuentaCorriente cuenta1 = new CuentaCorriente();
       CuentaCorriente cuenta2 = new CuentaCorriente("Sara Granadino", "2206-9510", 1500);
       CuentaCorriente cuenta3 = new CuentaCorriente("Adriana Padilla", "2285-7741", 6000);
       
       //ASIGNANDO UN NOMBRE A cuenta1
       cuenta1.setNombre("Alberto Fernandez");
       
       //ASIGNANDO UN TELEFONO A cuenta1
       cuenta1.setTelefono("2216-1917");
       
       //ABONANDO A cuenta1
        cuenta1.abono(2000);
        
        //CARGANDO A cuenta1
        cuenta1.cargo(600);
        //ABONANDO A cuenta3
        cuenta3.abono(75);
        //CARGANDO A cuenta1
        cuenta1.cargo(55);
        //TRANSFIRIENDO DE cuenta2 A cuenta1
        cuenta2.transferencia(cuenta1, 100);
        //TRANSFIRIENDO DE cuenta1 A cuenta3
        cuenta1.transferencia(cuenta3, 250);
        //TRANSFIRIENDO DE cuenta3 A cuenta1  
        cuenta3.transferencia(cuenta1, 22);
        //MOSTRANDO TODOS LOS MOVIMIENTOS DE LA cuenta1
        cuenta1.movimientos();
        
    }
    
}
