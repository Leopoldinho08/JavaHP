package Clase2.Interfaces;

public class Vaca implements Animales{

    private String nombre;

    public Vaca(String nombre) {
        super();
        this.nombre = nombre;
    }

    @Override
    public void sonido() {
        System.out.println("Vaca con nombre: " .concat(this.nombre).concat(", realiza el sonido mooo moo")); //.concat es igual que usar +
    }


}
