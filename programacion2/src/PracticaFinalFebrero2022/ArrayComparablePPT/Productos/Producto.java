/*Se pide que Ud. cree un ArrayList con los datos de los produtos cuyos atributos son: Nombre, descripcion, precio, año de caducidad.
* Se le pide que ordene el arreglo de mayor a menor por precio de producto y que muestre por pantalla todos los productos que sean del mismo año de caducidad.
* Sacar, además, el precio promedio de todos los productos y liste por pantalla todos los productos cuyo precico sea menor a ese promedio*/
package PracticaFinalFebrero2022.ArrayComparablePPT.Productos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Producto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double promedio;
        double suma = 0;

        ArrayList<productos> producto = new ArrayList<productos>();

        System.out.println("Ingrese la cantidad de productos: ");
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++){

            productos pro = new productos();

            System.out.println("Ingrese en nombre del producto " + (i+1));
            pro.nombre = scanner.next();
            System.out.println("Descripcion:");
            pro.descripcion = scanner.next();
            System.out.println("Precio: $");
            pro.precio = scanner.nextDouble();
            System.out.println("Año de caducidad: ");
            pro.añoCaducidad = scanner.next();

            producto.add(pro);

        }

        for (int i = 0; i < cantidad; i++){
            for (int j = (i+1); j < cantidad; j++ ){

                if (producto.get(i).añoCaducidad.equalsIgnoreCase(producto.get(j).añoCaducidad)){
                    System.out.println("Años de caducidad repetidos: " + producto.get(j).añoCaducidad);
                    System.out.println("Productos con el mismo año de caducidad: " + producto.get(i).nombre + " y " + producto.get(j).nombre);
                }
            }
        }

        producto.sort(Collections.reverseOrder());

        System.out.println("Productos ordenados por precio de Mayor a Menor: ");

        for (int i = 0; i < cantidad; i++){
            System.out.println((i+1) + ". Nombre del producto: " + producto.get(i).nombre + "\nPrecio: $" + producto.get(i).precio);
        }

        for (int i = 0; i < cantidad; i++) {
            suma = suma + producto.get(i).precio;
        }

        promedio = suma / cantidad;

        System.out.println("El precio promedio de todos los productos es: $" + promedio);

        for (int i = 0; i < cantidad; i++){
            if (producto.get(i).precio < promedio) {
                System.out.println("Productos menores al promedio: \n" + (i +1) + ". Nombre: " + producto.get(i).nombre + "\nPrecio: $" + producto.get(i).precio);
            }
        }
    }

    static class productos implements Comparable<productos>{

        private String nombre, descripcion, añoCaducidad;
        private double precio;

        @Override
        public int compareTo(productos o) {
            if(precio < o.precio){
                return -1;
            }else if (precio > o.precio){
                return 1;
            }
            return 0;
        }
    }


}
