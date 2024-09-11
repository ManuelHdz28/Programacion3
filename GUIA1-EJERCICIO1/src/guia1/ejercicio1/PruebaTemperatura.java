
package guia1.ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;


public class PruebaTemperatura {
    
    int numeroMes;
    String nombreMes;
    int temperaturaMes;

    // Constructor
    public PruebaTemperatura(int numeroMes, String nombreMes, int temperaturaMes) {
        this.numeroMes = numeroMes;
        this.nombreMes = nombreMes;
        this.temperaturaMes = temperaturaMes;
    }

    // Método para mostrar información del mes
    @Override
    public String toString() {
        return "[" + numeroMes + "] " + nombreMes + " - " + temperaturaMes + "°C";
    }
    
    // Método estático para calcular la temperatura media
    public static double calcularTemperaturaMedia(ArrayList<PruebaTemperatura> listaMeses) {
        double sumaTemperaturas = 0.0;
        for (PruebaTemperatura mes : listaMeses) {
            sumaTemperaturas += mes.temperaturaMes;
        }
        return sumaTemperaturas / listaMeses.size();
    }

    // Método estático para encontrar la temperatura más alta
    public static double encontrarTemperaturaMaxima(ArrayList<PruebaTemperatura> listaMeses) {
        int temperaturaMaxima = Integer.MIN_VALUE;
        Iterator<PruebaTemperatura> iterator = listaMeses.iterator();
        while (iterator.hasNext()) {
            PruebaTemperatura mes = iterator.next();
            if (mes.temperaturaMes > temperaturaMaxima) {
                temperaturaMaxima = mes.temperaturaMes;
            }
        }
        return temperaturaMaxima;
    }

    // Método estático para imprimir los meses más calurosos
    public static void imprimirMesesMasCalurosos(ArrayList<PruebaTemperatura> listaMeses, double temperaturaMaxima) {
        System.out.println("El mes o meses más calurosos fueron:");
        for (PruebaTemperatura mes : listaMeses) {
            if (mes.temperaturaMes == temperaturaMaxima) {
                System.out.println("- El mes " + mes.numeroMes + " (" + mes.nombreMes + ") con " + mes.temperaturaMes + " grados.");
            }
        }
    }
    
}
