package guia01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Ejercicio01 {

    public static void main(String[] args) {
        
        /* EJERCICIO 01: Crea una lista que contenga los días de la semana, que el programa ejecute las siguientes
            instrucciones: 
        
            • Inserta en la posición 4 el elemento “Juerneses”. X
            • Copia esa lista en otra lista llamada listaDos. X
            • Muestra el contenido de las posiciones 3 y 4 de la lista original.X
            • Elimina el elemento que contenga “Juerneses” de la lista y comprueba si elimina algo o no.
            • Crea un iterador y muestra uno de los valores de la lista original.
            • Busca si hay un elemento que se denomine “Lunes”.
            • Busca si existe en la lista un elemento que se denomine “Lunes”. No importa si está en
              mayúsculas y minúsculas.

        */
        
        //CREAR LA LISTA
       // String dias[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};//ARRAY 
         List<String> lp = new ArrayList<String>(); // CREA UNA INSTANCUA DE UN ARRAYLIST TIPO STRING 
       // java.util.List<String> listaDias = new java.util.ArrayList<>(Arrays.asList(dias));
        
       // AGREGAR LOS DATOS A LA ARRAYLIST
       
       lp.add("lunes");
       lp.add("Martes");
       lp.add("Miercoles");
       lp.add("Jueves");
       lp.add("Viernes");
       lp.add("Sabado");
       lp.add("Domingo");
       
       
        //Visualizacion de la lista
        for (String e : lp) {
            System.out.println("[" + e + "]");
        }
        
        // • Inserta en la posición 4 el elemento “Juerneses”.
        lp.set(3, "Juerneses");
        
        //• Copia esa lista en otra lista llamada listaDos. 
         List<String> listaDos = new ArrayList<String>(); // Se crea un nuevo ArrayList llamado ListaDos
         listaDos.addAll(lp); // se copia los datos que estan en la lista lp a la nueva lista
         
         
        //• Muestra el contenido de las posiciones 3 y 4 de la lista original.
        for (int i = 3; i < 5; i++) {
            System.out.println(" posicion [" + i + "]" + lp.get(i)); 
        }
        
        //• Elimina el elemento que contenga “Juerneses” de la lista y comprueba si elimina algo o no.
          lp.remove(3); // elimina los datos de la posicion [4] de "Juevernes"
           for (String e : lp) {
            
            System.out.println("[" + e + "]");
        }
        
       System.out.println("El cuarto elemento es: " + lp.get(3));
       
       //• Crea un iterador y muestra uno de los valores de la lista original.
       Iterator<String> iterador = lp.iterator();
       
       int inicio = 0;
        while (iterador.hasNext()) {
            String next = iterador.next();
            if (inicio == 3) {
                System.out.println("El cuarto elemento de la lista es: " + next);
            }
            inicio++;
        }
        
        //• Busca si hay un elemento que se denomine “Lunes”.
        boolean resultado=false;
        for (String listaDo : listaDos) {
            if(listaDo == "Lunes"){
                System.out.println("Se encontro");
                resultado = true;
            }
        }
        if (!resultado) {
            System.out.println("No se encontro");
        }
       
        //• Busca si existe en la lista un elemento que se denomine “Lunes”. No importa si está en mayúsculas y minúsculas.
        resultado=false;
        for (String listaDo : listaDos) {
            if(listaDo == "Lunes" || listaDo == "lunes"){
                System.out.println("Se encontro");
                resultado = true;
            }
        }
        if (!resultado) {
            System.out.println("No se encontro");
        }
        
        
        //Visualizacion de la lista
        for (String e : lp) {
            
            System.out.println("[" + e + "]");
        }
        
        
    }
    
}
