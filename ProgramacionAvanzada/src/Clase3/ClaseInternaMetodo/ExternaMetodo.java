package Clase3.ClaseInternaMetodo;

public class ExternaMetodo {

    public void Saludar(){
        System.out.println("Saludos!");
    }

    public void proceso(){

        final double decimal = 12.5;

        //Definicion de clase InternaMetodo
        class InternaMetodo {

            void muestra(){
                System.out.println("Clase local metodo.\nDecimal: " + decimal);
                Saludar(); //Se puede acceder a los miembros de instancia o estaticos de la clase ExternaMetodo
            }
        }
        //Uso de la clase interna definida previamente...
        InternaMetodo internaMetodo = new InternaMetodo();
        internaMetodo.muestra();
    }
}
