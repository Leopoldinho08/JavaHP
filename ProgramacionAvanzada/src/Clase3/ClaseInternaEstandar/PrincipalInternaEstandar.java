package Clase3.ClaseInternaEstandar;

public class PrincipalInternaEstandar {

    public static void main(String[] args) {

        Externa externa = new Externa();
        externa.mensajeExterna();
        //INSTANCIA DE LA CLASE INTERNA A TRAVES DE LA CLASE EXTERNA
        Externa.Interna interna = externa.new Interna(); //Utilizo el new sobre la clase externa
        interna.mensajeInterna();
    }
}
