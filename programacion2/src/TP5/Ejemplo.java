/*Se pide que Ud cree un ArrayList con los datos de
productos cuyos atributos son: nombre, descripción, precio y
año de caducidad.  Se le pide que ordene el arreglo de mayor a menor
por precio de producto y que muestre por pantalla todos los productos que
sean del mismo año de caducidad.
Sacar además el precio promedio de todos los productos y liste por pantalla
todos los productos cuyo precio sea menor a ese promedio.
*/
package TP5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejemplo {

    static int n;

    static class productos implements Comparable<productos>{

        private String nombre, descripcion, añoCaducidad;
        private double precio;


        public productos() {
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.añoCaducidad = añoCaducidad;
            this.precio = precio;
        }

        @Override
        public int compareTo(productos o) {
            if (precio < o.precio){
                return -1;
            }
            if (precio > o.precio){
                return 1;
            }
            return 0;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double promedio = 0;
        double suma = 0;

        ArrayList<productos> producto = new ArrayList<productos>();

        System.out.println("Ingrese la cantidad de productos a ingresar: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++){

            productos pro = new productos();

            System.out.println("Ingrese nombre del producto: ");
            pro.nombre = sc.next();
            System.out.println("Ingrese la descripcion del producto: ");
            pro.descripcion = sc.next();
            System.out.println("Ingrese el precio del producto: ");
            pro.precio = sc.nextDouble();
            System.out.println("Ingrese el año de caducidad del producto: ");
            pro.añoCaducidad = sc.next();

            producto.add(pro);
        }
        for (int i = 0; i < n; i++){
            for (int j = i +1; j < n; j++){
                if (producto.get(i).añoCaducidad.equalsIgnoreCase(producto.get(j).añoCaducidad)){
                    System.out.println("Años de caducidad repetidos: " + producto.get(j).añoCaducidad);
                    System.out.println("Productos con el mismo año de caducidad: " + producto.get(i).nombre + " y " + producto.get(j).nombre);
                }
            }
        }

        producto.sort(Collections.reverseOrder());//ordenado mayor a menor

        System.out.println("Productos ordenados de mayor a menor");
        for (int i = 0; i < n; i++){
            System.out.println((i+1) + ". Nombre: " + producto.get(i).nombre +
            "\n\tPrecio: " + producto.get(i).precio + "$" );
        }

        for (int i = 0; i < n; i++){
            suma = suma + producto.get(i).precio;
        }
        promedio = suma / n;
        System.out.println("El precio promedio de todos los productos es: " + promedio);

        for (int i = 0; i < n; i++){
            if (producto.get(i). precio < promedio){
                System.out.println("Productos menores al promedio: " + " Nombre: "
                + producto.get(i).nombre + "\nPrecio: " + producto.get(i).precio + "$");
            }

        }
    }
}
