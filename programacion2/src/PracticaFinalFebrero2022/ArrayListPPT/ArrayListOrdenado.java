/*hacer una funcion que me permita ordenar de mayor a menor todos los numeros*/
package PracticaFinalFebrero2022.ArrayListPPT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListOrdenado {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayListMayorMenor();
    }

    static void ArrayListMayorMenor(){
        ArrayList<Integer> Numeros = new ArrayList<>();

        System.out.println("Ingrese la cantidad de numeros: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidad; i++){
            System.out.println("Ingrese numero " + (i+1) + "°: ");
             int num = scanner.nextInt();
            Numeros.add(num);
        }

        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(Numeros, comparador);

        for (int i = 0; i < cantidad; i++){
            Numeros.get(i);
        }

        System.out.println("---------------------------------------\n\tNumeros Ordenados Mayor a Menor\n---------------------------------------\n" + Numeros);
    }

}
