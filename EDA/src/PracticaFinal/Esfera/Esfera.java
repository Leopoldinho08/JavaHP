package PracticaFinal.Esfera;

public class Esfera {

    private double radio;

    //Constructor
    public Esfera(double radio) {
        if (radio > 0){
            this.radio = radio;
        }else {
            this.radio = 0;
        }
    }

    //Metodos

    public double getRadio() {
        return radio;
    }

    public double diametro(){
        return(radio * 2);
    }

    public double circunferencia(){
        return(Math.PI * diametro());
    }

    public double area(){
        return(4 * Math.PI * Math.pow(radio, 2));
    }

    public double volumen(){
        return(4 * Math.PI * Math.pow(radio, 3));
    }
}
