package TPGrupal.Oficial.TPGrupalLeo;

import javax.swing.*;

public class Plata extends Cliente{

    int servicioGrua;
    int distanciaGrua;
    int montoGrua;
    int servicioCerrajeria;
    int montoCerrajeria;
    int montoPlus;
    int montoMensual;
    int montoTotal;

    public Plata() {

        super();
        this.servicioGrua = 0;
        this.distanciaGrua = 0;
        this.montoGrua = 0;
        this.servicioCerrajeria = 0;
        this.montoCerrajeria = 0;
        this.montoPlus = 0;
        this.montoMensual = 700;
        this.montoTotal = 0;

    }

    public boolean Distancia(){

        int distancia = Integer.parseInt(JOptionPane.showInputDialog(null, "Tuvo distancias mayores a 500km en sus pedidos?\n1 = Si, 2 = No"));
        if (distancia == 1){
            return true;
        }else {
            return false;
        }
    }

    public void ServicioGrua(){

        servicioGrua = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de veces que pidió el servicio de grúa"));
        if (servicioGrua == 0){
            JOptionPane.showMessageDialog(null, "N ha pedido servicio de grua");
        }else {
            if (Distancia()){
                do {
                    distanciaGrua = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de veces que excedió la distancia máxima"));
                    if (servicioGrua < distanciaGrua) {
                        JOptionPane.showMessageDialog(null, "ERROR");
                    }
                }while(servicioGrua < distanciaGrua);
            }
        }


        if (servicioGrua > 2){
            montoPlus += ((servicioGrua - 2) * 600);
        }
        if (distanciaGrua > 0){
            // falta preguntar cuantos km hizo cada vez. xq no es cuantas veces sino por cuanto se paso.
            // por cada 100 km * 300
            montoPlus += (distanciaGrua * 300);
        }

        montoGrua += montoPlus;
    }

    public void ServicioCerrajeria(){

        servicioCerrajeria = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de veces que pidió el servicio de cerrajería"));
        if (servicioCerrajeria == 0){
            JOptionPane.showMessageDialog(null, "No ha pedido servicio de cerrajeria");
        }else {
            if (servicioCerrajeria > 3){
                montoPlus += ((servicioCerrajeria - 4) * 600);
            }
        }

        montoCerrajeria += montoPlus;
    }

    public int MontoTotal(){

        montoTotal = montoMensual + montoPlus;
        return montoTotal;
    }

    public void printMontoTotal(){
        System.out.println(MontoTotal());
    }


}
