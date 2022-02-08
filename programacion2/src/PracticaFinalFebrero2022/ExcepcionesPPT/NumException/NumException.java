package PracticaFinalFebrero2022.ExcepcionesPPT.NumException;

import java.util.Scanner;

public class NumException {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String cadena = "500L";
        int numero;
        if (isNumeric(cadena) == true){
            numero = Integer.parseInt(cadena);
            System.out.println("Numero: " + numero);
        }else {
            System.out.println("No es un numero!");
        }

    }

    public static boolean isNumeric(String cadena){

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        }catch (NumberFormatException e){
            resultado = false;
        }
        return resultado;
    }
}
