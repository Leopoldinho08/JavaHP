/*Realizar un programa que me pida el ingreso de mi nombre y apellido y lo muestre
por pantalla.*/
package TP1;
import java.util.Scanner;

    public class Ej2{

        private static Scanner completeName;

        public static void main(String [] args){

            completeName = new Scanner(System.in);

            String name;
            String surname;
            
            System.out.println("Ingrese su nombre: ");
            name = completeName.nextLine();
            System.out.println("Ingrese su apellido: ");
            surname = completeName.nextLine();

            System.out.println(name + surname);

        }
    }



    
