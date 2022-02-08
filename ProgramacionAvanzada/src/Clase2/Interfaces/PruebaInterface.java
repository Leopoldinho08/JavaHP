package Clase2.Interfaces;

public class PruebaInterface {

     public static void main(String[] args){

         Animales[] animal = new Animales[3];
         animal[0] = new Chancho("Chanchito feliz");
         animal[1] = new Vaca("Lola");
         animal[2] = new Chancho("Chanchito triste");

         for (int i = 0; i < animal.length; i++){
             animal[i].sonido();
             animal[i].dormir();

         }

         Animales animales = new Animales() {
             @Override
             public void sonido() {
                 System.out.println("ZzZz");
             }
         };

         animales.sonido();
         animales.dormir();
     }
}
