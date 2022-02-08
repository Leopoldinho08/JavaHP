package Clase2.Interfaces;

public interface Animales {

    void sonido();
    default void dormir(){
        System.out.println("ZZZZZZZZZZZZZZ");
    }


}
