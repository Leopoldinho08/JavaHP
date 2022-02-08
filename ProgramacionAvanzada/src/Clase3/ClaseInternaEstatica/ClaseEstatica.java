package Clase3.ClaseInternaEstatica;

public class ClaseEstatica {

    public static class InternaEstatica{

        public void mensajeEstatica(){
            System.out.println("Mensaje desde la clase interna estatica");
            //Saludar(); No se puede llamar a un miembro de instancia de la clase Externa
            Sal2(); //Esto si es posible porque el metodo Saludar2(); es Estatico
        }
    }

    public static void Sal2(){
        System.out.println("Sal2!");
    }

    //Metodo de instancia
    public void Saludar(){
        System.out.println("Saludos!");
    }
}
