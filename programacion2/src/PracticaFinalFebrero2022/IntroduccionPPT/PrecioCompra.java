package PracticaFinalFebrero2022.IntroduccionPPT;

import java.util.Scanner;

public class PrecioCompra {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double precio;
        int cantidad;

        System.out.println("Precio del articulo: ($)");
        precio = scanner.nextDouble();
        System.out.println("Cantidad de articulos: ");
        cantidad = scanner.nextInt();

        System.out.println("Total de orden de compra: $" + precio * cantidad + " por " + cantidad + " articulos");

    }
}
