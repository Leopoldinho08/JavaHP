package TPs1erCuatrimestre.TP9TP10.Colas2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Colas {

    public static class ClaseColas{ //Declaracion de la clase de Colas
        static int max = 10; //Tamaño maximo de la Cola
        static int cola[] = new int[max]; //Declaracion del arreglo
        static int frente, fin; //Indicadores de inicio y fin de la Cola

        ClaseColas(){ //Constructor que inicializa el frente y el final de la Cola
            frente = 0;
            fin = 0;
            System.out.println("Cola inicializada!");
        }

        public static void insertar(int dato){
            if(fin == max){ //Esta llena la Cola?
                System.out.println("Cola llena!");
                return;
            }
            cola[fin++] = dato;
            System.out.println("Dato insertado!");
        }

        public static void eliminar(){
            System.out.println("\n<<<ELIMINAR>>>");
            if (frente == fin){ //Esta vacia la Cola?
                System.out.println("Elemento eliminado: " + cola[frente++]);
            }
        }

        public static void mostrar(){
            System.out.println("\n<<<MOSTRAR>>>");
            if (frente == fin){
                System.out.println("Cola vaica!");
            }
            for (int i = frente; i < fin; i++){
                System.out.println("Cola[" + i + "]- " + cola[i]);
            }
            System.out.println("Frente - " + frente);
            System.out.println("Final - " + fin);
            System.out.println("Max - " + max);
        }
    }

    static ClaseColas Cola = new ClaseColas(); //Declaracion del objeto Cola

    //MAIN
    public static void main(String[] args) throws IOException {
        int op = 0;
        do{
            System.out.println("\n<<<COLAS>>>");
            System.out.println("1. Altas");
            System.out.println("2. Eliminar");
            System.out.println("3. Mostrar");
            System.out.println("0. Salir");
            System.out.println("Opcion? -----> ");
            op = getInt();

            switch (op){
                case 1: Altas();
                    break;
                case 2: Cola.eliminar();
                    break;
                case 3: Cola.mostrar();
                    break;
            }
        }while (op != 0);
    }

    public static void Altas() throws IOException{
        int elemento = 0;
        System.out.println("\n<<<ALTAS>>>");
        System.out.println("Elemento a insertar? ---> ");
        elemento = getInt();
        Cola.insertar(elemento); //Invocar el metodo Insertar del objeto Cola
    }
    //Funcion para capturar una cadena desde el teclado
    public static String getString() throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    //Funcion para capturar un entero desde el teclado
    public static int getInt() throws IOException{
        String s = getString();
        return Integer.parseInt(s);
    }

}
