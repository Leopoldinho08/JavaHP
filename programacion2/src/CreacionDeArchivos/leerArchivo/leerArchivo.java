/* Algoritmo para leer un archivo
    1. Declarar una variable de tipo File
    2. Declarar una variable de tipo FileReader
    3. Declarar una variable de tipo String
    4. Preparar el archivo
    5. Crear una instancia de tipo FileReader
    6. Crear una instancia de tipo BufferedReader
    7. Inicializar la variable de tipo String a nada
    8. Crear un ciclo que se repita mientras la variable de tipo String sea diferente a nulo
        a. Asignar a la variable de tipo String buffer.readLine()
        b. Si la variable de tipo String es diferente a nulo
            1. Mostrar su contenido
    9. Cerrar el buffer
    10. Cerrar el lector
 */
package CreacionDeArchivos.leerArchivo;

import java.io.*;

public class leerArchivo {

    public static void main(String[] args){

        File miArchivo;
        FileReader lector;
        String cadena;

        miArchivo = new File("ejemploEscritura.txt");
        try {
            lector = new FileReader(miArchivo);
            BufferedReader almacenamiento = new BufferedReader(lector);
            cadena = "";
            while (cadena != null){
                try {
                    cadena = almacenamiento.readLine(); //Para que me almacene una linea de texto
                    if (cadena != null){
                        System.out.println(cadena);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                almacenamiento.close();
                lector.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
