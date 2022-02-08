package PracticaFinal.Recursividad;

public class BajarEscalera {

    public static void main(String[] args){
        BajarEscalera escalera = new BajarEscalera();
        escalera.bajaEscalera(20);
    }

    public void bajaEscalera(int escalones){
        if (escalones == 0){ //Caso Base, Respuesta explicita
            System.out.println("Has terminado de bajar la escalera");
        }else { //Dominio, division del problema original(problema - 1)
            try {
                Thread.sleep(1000);//para que vaya mas lento cuando lo imprime(ponele). 1000 son 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Bajando escalón " + escalones);
            //haciendo uso de la recursividad
            bajaEscalera(escalones - 1);
        }
    }
}
