/*Realizar un programa que pida el ingreso de 3 números por teclado y que los
muestre ordenados de mayor a menor.*/
package TP1;
import java.util.Scanner;

public class Ej3{

    private static Scanner sc;

    public static void main(String[] args){

        sc = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Ingrese el primer numero: ");
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        n3 = sc.nextInt();

        if((n1 > n2) & (n1 > n3)){
            if(n2 > n3){
                System.out.println(n1 + " > " + n2 + " > " + n3);
            }else{
                System.out.println(n1 + " > " + n3 + " > " + n2);
            }
        }else if((n2 > n1) & (n2 > n3)){
            if(n1 > n3){
                System.out.println(n2 + " > " + n1 + " > " + n3);
            }else{
                System.out.println(n2 + " > " + n3 + " > " + n1);
            }
        }else if((n3 > n1) & (n3 > n2)){
            if(n1 > n2){
                System.out.println(n3 + " > " + n1 + " > " + n2);
            }else{
                System.out.println(n3 + " > " + n2 + " > " + n1);
            }
        }
        
    }
}
/*public class tres {

    public static void main(String[] args) {
    Scanner numeros = new Scanner(System.in);
        
    int[] arreglo= new int [3];
    for (int f=0;f<arreglo.length;f++){
        
        System.out.println("introduce un numero: ");
        arreglo[f]= numeros.nextInt();
    }
        int aux=0;

            for (int f=0; f<arreglo.length;f++){
                for(int j=f+1; j<arreglo.length;j++){

                    if (arreglo[f]>arreglo[j]){
                        aux= arreglo[f];
                        arreglo[f]=arreglo[j];
                        arreglo[j]= aux;
                    }
                }
            }
            System.out.println ("ordenado");
        for (int f=0;f<arreglo.length; f++){
            System.out.println (arreglo[f]);
        }
    
    }   
            
}*/