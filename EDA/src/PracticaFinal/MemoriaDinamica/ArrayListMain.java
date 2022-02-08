/*Memoria dinamica es el espacio de memoria el cual el tamaño
puede variar durante la ejecuccion del programa. Ej: ArrayList que tiene espacio que varia
 */
package PracticaFinal.MemoriaDinamica;
import javax.swing.*;
import java.util.ArrayList;

public class ArrayListMain {

    public static void main(String[] args){

        ArrayList<String> cadenas = new ArrayList<String>(); //Creando un objeto o instancia de tipo ArrayList
        String frase, respuesta;
        do{
            frase = JOptionPane.showInputDialog(null, "Ingrese la frase: ");
            //Agregando la frase a la lista
            cadenas.add(frase);
            respuesta = JOptionPane.showInputDialog(null, "Desea seguir almacenando mas frases(SI/NO)? ");
        }while (!respuesta.equalsIgnoreCase("no"));
        //Mostarndo el contenido de 'cadenas'
        for (int i = 0; i < cadenas.size(); i++){
            System.out.println("[" + cadenas.get(i) + "]");
        }
        //Utilizar metodo set()
        cadenas.set(1, "MODIFICADA");
        //Mostarndo el contenido de 'cadenas' ya modificadas
        System.out.println("Frases modificadas");
        for (int i = 0; i < cadenas.size(); i++){
            System.out.println("[" + cadenas.get(i) + "]");
        }
        //Metodo removw()
        cadenas.remove(0);
        System.out.println("Frases que nos quedan");
        for (int i = 0; i < cadenas.size(); i++){
            System.out.println("[" + cadenas.get(i) + "]");
        }
    }
}
