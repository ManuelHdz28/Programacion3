package guia01;

import java.util.LinkedHashSet;
import java.util.Set;



public class Ejercicio2 {
    public static void main(String[] args) {
        
        /*
        Crea una colección al que se le va a llamar jugadores. Inserta en la colección los jugadores de
        un equipo de futbol, que el programa ejecute las siguientes instrucciones.
        • Realice un bucle sobre los jugadores de la colección y muestre sus nombres.
        • Consulte si en la colección existe el jugador “Neymar Jr”.
        • Crea una segunda colección jugadores2 con los jugadores “Pique” y “Busquets”.
        • Consulte si todos los elementos de jugadores2 existen en jugadores.
        • Realiza una unión de las colecciones jugadores y jugadores2.
        • Elimina todos los jugadores del conjunto jugadores2 y muestra el número de jugadores
          que tiene la colección jugadores2 (debería ser cero): Se requiere que se realice con Java usando Set (consola).
    */
    

    LinkedHashSet<String> jugadores = new LinkedHashSet<>(); // se crea una interfaz tipo set
    
    // llenado de la lista tipo set
    jugadores.add("Endrick Felipe");
    jugadores.add("Rodrygo");
    jugadores.add("Savinho");
    jugadores.add("Lucas Paquetá");
    jugadores.add("Casemiro");
    jugadores.add("Neymar Jr");
    jugadores.add("Raphinha");
    jugadores.add("Vinicius Junior");
    jugadores.add("Alisson Becker");
    jugadores.add("Ederson Moraes");    
    
    // • Realice un bucle sobre los jugadores de la colección y muestre sus nombres.
        int contador = 1;
        for (String e : jugadores) {
             System.out.println("Jugadores [" + contador + "] = " + e);
             contador++;
        }
    // • Consulte si en la colección existe el jugador “Neymar Jr”. 
        boolean busqueda = false;
        contador = 0;
        for (String e : jugadores) {
             if (e == "Neymar Jr") {
                 System.out.println("Se Encontro la busqueda de 'Neymar Jr' en la posicion [" + contador + "]");
            }
             contador++;
        }
        if (!busqueda) {
                 System.out.println("No se Encontro la busqueda de 'Neymar Jr' en ninguna posicion");
            }
        
    // • Crea una segunda colección jugadores2 con los jugadores “Pique” y “Busquets”.
        LinkedHashSet<String> jugadores2 = new LinkedHashSet<>(); // se crea una interfaz tipo set
    
        // llenado de la lista tipo set
        jugadores.add("Pique");
        jugadores.add("Busquets");
        
    // • Consulte si todos los elementos de jugadores2 existen en jugadores.
        Set<String> interseccionJugadores = new LinkedHashSet<>(jugadores); // se crea una copia de la lista de Jugadores
        interseccionJugadores.retainAll(jugadores2); // se buscan los datos comunes de las listas
        System.out.println("Elementos comunes: " + interseccionJugadores); //se muestra si hay coincidencias en los datos de las listas
        
    // • Realiza una unión de las colecciones jugadores y jugadores2.
        Set<String> jugadoresUnidos = new LinkedHashSet<>(jugadores); // Iniciar con setOriginal
        jugadoresUnidos.addAll(jugadores2); // Agregar todos los elementos de setNuevo

        // Imprimir el LinkedHashSet unido
        System.out.println("Conjunto unido: " + jugadoresUnidos);
        
    // • Elimina todos los jugadores del conjunto jugadores2  
        jugadores2.clear();
    
    // • Muestra el número de jugadores que tiene la colección jugadores2 (debería ser cero)
        System.out.println("Elementos en setNuevo después de clear(): " + jugadores2.size());
    }
}
