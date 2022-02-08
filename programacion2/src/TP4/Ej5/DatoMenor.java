/*Hacer una función que dado un ArrayList de Enteros, me permita mostrar el valor menor
contenido en dicha estructura con el mensaje el valor menor es: */
package TP4.Ej5;

import java.util.ArrayList;

public class DatoMenor {

    ArrayList<Integer> Enteros = new ArrayList<Integer>();

    public static void main(String[] args){

        //arrayList(Enteros);
    }
    public static void arrayList(ArrayList<Integer> Enteros){

        Enteros.add(20);
        Enteros.add(15);
        Enteros.add(12);
        Enteros.add(34);
    }
    public static int menor(ArrayList<Integer> Enteros) {
        int menor = 0;
        for (int j = 0; j < 4; j++) {
            if (Enteros.get(j) < menor) {
                menor = Enteros.get(j);
            }
        }
        return menor;
    }
}

