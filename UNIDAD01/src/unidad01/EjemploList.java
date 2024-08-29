package unidad01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EjemploList {

    public static void main(String arg[]) {
        int temp = 0;
        List<Integer> lp = new ArrayList<Integer>();
        // El tipo es List y lo implementamos con ArrayList
        // Utilizamos lista genérica…le decimos que contendrá objetos Integer
        int sumaaltura = 0;
        //llenamos la lista
        for (int i = 0; i < 5; i++) {
            lp.add(i); //el compilador convierte el int en Integer
        }
        //Creamos objeto iterador para recorrer la lista
        Iterator it = lp.iterator();
        while (it.hasNext()) {
            temp = (int) it.next(); //devuelve obj genérico, hay que pasarlo a int.
            System.out.println(temp);
            sumaaltura += temp;
        } //fin while
        System.out.println(sumaaltura);
    } //fin main

}
