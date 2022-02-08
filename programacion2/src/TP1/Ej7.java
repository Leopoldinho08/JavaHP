/*Realiza un programa que muestre los números del 1 al 30 (ambos incluidos)
divisibles entre 2 y 3. Utiliza el bucle que desees. (Uso % para la operación).*/
package TP1;

public class Ej7{

    public static void main(String[] args){

        for(int i = 0; i < 30; i++){
            if((i % 2 == 0) & (i % 3 == 0)){
                System.out.println("El numero: " + i + " es divisible por 2 y 3");
            }
        }
    }
}