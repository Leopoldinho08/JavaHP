package Clase2;

public class BarcoTestConst {

    public static void main(String[] args){

        Barco barco = new Barco();
        barco.setDireccion("Noroeste");

        System.out.println("Direccion del barco: " + barco.getDireccion());

        barco.setDireccionEnum(Direccion.OESTE);

        System.out.println("DireccionEnum: " + barco.getDireccionEnum().getDescripcion());
    }
}
