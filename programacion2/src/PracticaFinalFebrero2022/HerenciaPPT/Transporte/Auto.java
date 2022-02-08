package PracticaFinalFebrero2022.HerenciaPPT.Transporte;

public class Auto extends Transporte{

    double velocidad_limite;
    String caracteristicas;


    public static void main(String[] args) {

        Auto Ferrari = new Auto();
        Ferrari.setVelocidad_limite(400);
        Ferrari.setCaracteristicas("Rojo");
        Ferrari.setTipo("F1");
        Ferrari.setCapacidad_pas(1);

        System.out.println(Ferrari.getTipo() + ", " + Ferrari.getCapacidad_pas() + ", " + Ferrari.getVelocidad_limite() + ", " + Ferrari.getCaracteristicas());
    }

    public Auto() {
        super();
    }

    public double getVelocidad_limite() {
        return velocidad_limite;
    }

    public void setVelocidad_limite(double velocidad_limite) {
        this.velocidad_limite = velocidad_limite;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }


}
