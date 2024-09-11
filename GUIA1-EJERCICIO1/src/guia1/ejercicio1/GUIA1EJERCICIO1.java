package guia1.ejercicio1;

import java.util.ArrayList;



public class GUIA1EJERCICIO1 {


    public static void main(String[] args) {
        // Crear una lista que contendrá objetos de tipo Mes
        ArrayList<PruebaTemperatura> listaMeses = new ArrayList<>();

        // Agregar los datos (numeroMes, nombreMes, temperaturaMes) a la lista
        listaMeses.add(new PruebaTemperatura(1, "Enero", 23));
        listaMeses.add(new PruebaTemperatura(2, "Febrero", 23));
        listaMeses.add(new PruebaTemperatura(3, "Marzo", 24));
        listaMeses.add(new PruebaTemperatura(4, "Abril", 25));
        listaMeses.add(new PruebaTemperatura(5, "Mayo", 24));
        listaMeses.add(new PruebaTemperatura(6, "Junio", 24));
        listaMeses.add(new PruebaTemperatura(7, "Julio", 24));
        listaMeses.add(new PruebaTemperatura(8, "Agosto", 24));
        listaMeses.add(new PruebaTemperatura(9, "Septiembre", 23));
        listaMeses.add(new PruebaTemperatura(10, "Octubre", 23));
        listaMeses.add(new PruebaTemperatura(11, "Noviembre", 23));
        listaMeses.add(new PruebaTemperatura(12, "Diciembre", 23));

        // Imprimir los datos de la lista
        for (PruebaTemperatura mes : listaMeses) {
            System.out.println(mes);
        }
        
        // Calcular y mostrar la temperatura media del año
        double temperaturaMedia = PruebaTemperatura.calcularTemperaturaMedia(listaMeses);
        System.out.println("Temperatura media del año: " + temperaturaMedia + "°C");

        // Encontrar y mostrar la temperatura más alta del año
        double temperaturaMaxima = PruebaTemperatura.encontrarTemperaturaMaxima(listaMeses);
        System.out.println("La temperatura más alta del año fue: " + temperaturaMaxima + "°C");

        // Imprimir los meses más calurosos del año
        PruebaTemperatura.imprimirMesesMasCalurosos(listaMeses, temperaturaMaxima);
    }
    
}
