package PracticaFinal.MemoriaEstatica;

import javax.swing.*;
import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args){

        int[] numeros = new int[5];
        String[] palabras = new String[5];
        int[] numerotes = new int[numeros.length];

        for (int i = 0; i < 5; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog
                    (null, "Ingresa el elemento del indice: " + (i + 1)));
        }
        System.out.println("Los datos sin ordenar son: ");
        for (int i = 0; i < 5; i++){
            System.out.print("[" + numeros[i] + "]");
        }
        System.out.println("\nLos datos ordenados son: ");
        Arrays.sort(numeros);
        for (int i = 0; i < 5; i++){
            System.out.print("[" + numeros[i] + "]");
        }
        //Rellenar el array de palabras
        Arrays.fill(palabras, "Bienvenido a la fiesta");
        System.out.println("\nElementos del arreglo palabras: ");
        for (int i = 0; i < 5; i++){
            System.out.print("[" + palabras[i] + "]");
        }
        //Copiando los elementos del array de numero en nuemrotes
        System.arraycopy(numeros, 0, numerotes, 0, numeros.length);
        System.out.println("\nElementos del array numerotes");
        for (int i = 0; i < 5; i++){
            System.out.print("[" + numerotes[i] + "]");
        }
    }
}
