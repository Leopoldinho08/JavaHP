package PracticaFinal.Esfera;

public class EsferaMain {

    public static void main(String[] args){
        Esfera esfera = new Esfera(3);
        System.out.println("Radio = " + esfera.getRadio());
        System.out.println("Diametro = " + esfera.diametro());
        System.out.println("Circunferencia = " + esfera.circunferencia());
        System.out.println("Area = " + esfera.area());
        System.out.println("Volumen = " + esfera.volumen());
    }
}
