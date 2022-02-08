package Clase3.ClaseInternaEstandar;

public class Externa {

    /*
         DECLARANCION DE LA CLASE INTERNA
     */
    public class Interna {

        public void mensajeInterna(){

            Externa externa = new Externa(); //INSTANCIA DE LA CLASE EXTERNA
            System.out.println("Soy un metodo de mi CLASE INTERNA. Class: " + this.getClass().getName());
            System.out.println("Estoy llamando al metodo de mi CLASE EXTERNA");
            externa.mensajeExterna(externa);
            mensajeExterna(); //SI Interna es estatica no podria hacer esto...
        }
    }

    public void mensajeExterna(){
        System.out.println("Soy un metodo de mi CLASE EXTERNA. Class: " + this.getClass().getName());
    }

    public void mensajeExterna(Object o){
        System.out.println("Soy un metodo de mi CLASE EXTERNA. Class: " + o.getClass().getName());
    }
}
