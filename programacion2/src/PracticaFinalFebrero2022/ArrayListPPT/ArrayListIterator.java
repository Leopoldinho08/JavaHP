/*Hacer una funcion que devuelva, en una variable mostrada por pantalla, la suma de todos los precios*/
package PracticaFinalFebrero2022.ArrayListPPT;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListIterator {

    public static void main(String[] args) {

        ArrayList<Integer> precios = new ArrayList<Integer>(4);
        int precio;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++){
            System.out.println("Ingrese valor: ");
            precio = scanner.nextInt();
            precios.add(precio);
        }

        int sum = 0;
        sum = (int) Suma(precios);

        System.out.println("Los precios ingresados son: " + precios);
        System.out.println("la suma de los precios es: " + sum);
    }
//No se cual es el sentido de poner double si precio es int?
    static double Suma(ArrayList<Integer> precios){
        double suma = 0;
        Iterator iterator = precios.iterator();
        while (iterator.hasNext()){
            suma = suma + (int) iterator.next();
        }
        return suma;
    }
}
