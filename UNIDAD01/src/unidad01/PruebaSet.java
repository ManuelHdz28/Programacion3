package unidad01;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class PruebaSet {
    
    public static  void main(String arg[]){
        
        LinkedHashSet<String> materias =  new LinkedHashSet<String>();
        
        materias.add("Programacion");
        materias.add("Matematicas");
        materias.add("Ciencias");
        materias.add("Ingles");
        materias.add("Frances");
        materias.add("Musica");
        
        materias.add("Musica"); // Intentamos hacer un duplicado
        
        System.out.println("Numero de elementos: " + materias.size() + "\n");
        
        Iterator i = materias.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            
        }
        
        
    }
    
}
