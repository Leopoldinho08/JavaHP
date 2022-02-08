/*Dado un Array de String, se pide que:
a. Se lo cargue con valores.
b. Se lo muestre por pantalla*/
package TP3.Ej5;

public class ArrayDeStrings {
    public static void main(String[] args){
        String[] arr = {"Perro", "Gato", "Avion", "Camion"};
        System.out.println("ARRAY");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
