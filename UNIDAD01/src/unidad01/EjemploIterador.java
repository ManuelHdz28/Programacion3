
package unidad01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class EjemploIterador {
    public static  void main(String arg[]){
        // El tipo es List y lo implementamos con ArrayList
        // Utilizamos Lista generica...le decimos que contendra objetos Integer
        
        List<Integer> lista = new ArrayList<>();
        int suma = 0;
        
        // Llenamos la lista
        for (int i = 0; i < 5; i++) {
           lista.add(i); // El compilador convierte el int en Integer
        }
        
        // Creamos objeto iterador para recorrer la lista
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            int temp = (int) it.next();
            System.out.println(temp);
            suma += temp;
        }// fin del while
        
        System.out.println("La Suma es: " + suma);
        
    }
    
}
