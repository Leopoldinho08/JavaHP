/*Dado un array de enteros, correspondiente a temperaturas de Buenos Aires, se pide que:
a. Se muestre por pantalla la menor temperatura y la mayor.
b. Además que se muestre por pantalla un valor suma que contenga la suma de
todas las temperaturas contenidas en el Array.*/
package TP3.Ej7;

import java.util.Scanner;

public class TemperaturaBsAs {
    public static Scanner sc;
    int[] temperatura;
    int arraySize;

    public TemperaturaBsAs(int[] temperatura) {
        this.temperatura = temperatura;
    }

    public int[] getTemperatura() {
        return temperatura;
    }

    public TemperaturaBsAs setTemperatura(int[] temperatura) {
        this.temperatura = temperatura;
        return this;
    }
    public static void size(int arraySize){
        System.out.println("Ingrese cantidad de temperaturas: ");
        arraySize = sc.nextInt();
    }
    public static void temps(int[] temperatura,int arraySize){
        for (int i = 0; i < arraySize; i++){
            System.out.println("Ingrese temperatura:\n" + (i +1) + ")");
            temperatura[i] = sc.nextInt();
        }
    }
    public static int temperaturaMinima(int[] temperatura, int arraySize){
        int tempMin = 0;
        for (int i = 0; i < arraySize; i++){
            temperatura[0] = tempMin;
            if(temperatura[i] < tempMin){
                tempMin = temperatura[i];
            }
        }
        return tempMin;
    }
    public static int temperaturaMaxima(int[] temperatura, int arraySize){
        int tempMax = 0;
        for (int i = 0; i < arraySize; i++){
            temperatura[0] = tempMax;
            if(temperatura[i] > tempMax){
                tempMax = temperatura[i];
            }
        }
        return tempMax;
    }

    public static int suma(int[] temperatura, int arraySize){
        int sum = 0;
        for (int i = 0; i < arraySize; i++){
            sum = sum + temperatura[i];
        }
        return sum;
    }
    public static double promedio(int arraySize, int sum){
        double prom = 0;
        prom = sum / arraySize;
        return prom;
    }

}
