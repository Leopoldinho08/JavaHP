/*Dado un Array de String llamado Cliente, se pide que:
a. se realice la carga de los mismos pidiendo los datos por teclado.
b. Se pide mostrar por pantalla un listado con todos los clientes cargados.
c. Se pide ordenar todos los clientes ordenados de menor a mayor.*/
package TP3.Ej4;
import java.util.Arrays;
import java.util.Scanner;

public class Clientes {
    private static Scanner sc;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int arraySize;

        System.out.println("Ingrese cantidad de clientes :");
        arraySize = sc.nextInt();

        String[] cliente = new String[arraySize];
        System.out.println("Ingrese clientes: ");
        for (int i = 0; i < arraySize; i++){
            System.out.println("Cliente " + (i+1) + ":");
            cliente[i] = sc.next();
        }
        System.out.println("\nCLIENTES");
        for (int i = 0; i < arraySize; i++){
            System.out.println((i+1) + ")" + cliente[i]);
        }
        Arrays.sort(cliente);
        System.out.println("\nMENOR A MAYOR");
        for (String j: cliente){
            System.out.println(j);
        }
    }
}
