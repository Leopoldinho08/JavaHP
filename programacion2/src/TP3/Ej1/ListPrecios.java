/*Dado un listado de precios (Estructura de Array), se pide que:
a. Se realice la carga del mismo pidiendo los datos por teclado.
b. ordénelo de mayor a menor.*/
package TP3.Ej1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ListPrecios {

    private static Scanner sc;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer[] precios = new Integer[5];
        //int cantidad;

        for (int i = 0; i < precios.length; i++){
            System.out.println("Ingrese precios: ");
            precios[i] = sc.nextInt();
        }
        Arrays.sort(precios, Collections.reverseOrder());
        System.out.println("MAYOR A MENOR");
        for (int j : precios){
            System.out.println(j);
        }

    }

   /* public static void ingresoPrecios(Integer[] precios){
        for (int i = 0; i < 10; i++){
            System.out.println("Ingrese precios: ");
            precios[i] = sc.nextInt();
        }
    }

    public static void mayorMenor(Integer[] precios){
        Arrays.sort(precios, Collections.reverseOrder());
        for (int i : precios){
            System.out.println(i + "");
        }
    }*/



        /*System.out.println("Ingrese la cantidad de precios: ");
        cantidad = sc.nextInt();

        for (int i = 0; i < cantidad; i++){
            System.out.println("Ingresar precio: $");
            precios[i] = sc.nextInt();
        }*/

}
