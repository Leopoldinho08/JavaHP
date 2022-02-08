package Clase2.Interfaces;

public class Chancho implements Animales{


    private String nombre;

    public Chancho(String nombre) {
        super();
        this.nombre = nombre;
    }

    @Override
    public void sonido() {
        System.out.println("Chancho con nombre: " + this.nombre + ", realiza sonido Wee Wee");
    }

}
