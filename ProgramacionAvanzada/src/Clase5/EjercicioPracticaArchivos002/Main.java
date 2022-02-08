/*
Construir un programa principal en el que se deberá:
∙ Generar una lista de construcciones, a partir de un archivo de texto.
∙ Imprimir en pantalla los datos de dichas construcciones.
∙ Mostrar por pantalla las construcciones que se encuentren entre un rango de precio. ∙ A
las construcciones obtenidas del punto anterior, se debe de volver a calcular el precio
sumándole el IVA (21%).
∙ La lista de construcciones generada, deberán de persistirse en un archivo con el siguiente
nombre construc_ddMMyyyy.txt.
 */
package Clase5.EjercicioPracticaArchivos002;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        FileManager fileManager = new FileManager();

        Construccion construccion = new Edificio(120.0, "Lavalle 1494", 50000.0, 10, 50);

        fileManager.guardar(construccion);

        List<Construccion> construccionDesdeArchivo = new ArrayList<Construccion>();
        try {
            construccionDesdeArchivo = fileManager.getConstrucciones();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Construccion var : construccionDesdeArchivo) {
            System.out.println(var);
        }
    }
}
