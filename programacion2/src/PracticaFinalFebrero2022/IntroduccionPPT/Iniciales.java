/* Programa para imprimir las iniciales del nombre introducido por el usuario*/

package PracticaFinalFebrero2022.IntroduccionPPT;

import java.util.Scanner;

public class Iniciales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        String apellido;

        System.out.println("Introduzca nombre y apellido separados por un espacio: ");
        nombre = scanner.next().toUpperCase();
        apellido = scanner.next().toUpperCase();

        System.out.println("Sus iniciales son: " + nombre.charAt(0) + apellido.charAt(0) + ".");
    }

}
