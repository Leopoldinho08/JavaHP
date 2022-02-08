package TPGrupal.Oficial.TPGrupalLeo;

import javax.swing.*;

public class Oro extends Cliente{

    int servicioGrua;
    int distanciaGrua;
    int distanciaGruaTotal;
    int montoGrua;
    int servicioCerrajeria;
    int montoCerrajeria;
    int montoPlus;
    int montoMensual;
    int montoTotal;

    public Oro() {

        super();
        this.servicioGrua = 0;
        this.distanciaGrua = 0;
        this.distanciaGruaTotal = 0;
        this.montoGrua = 0;
        int servicioCerrajeria = 0;
        this.montoCerrajeria = 0;
        this.montoPlus = 0;
        this.montoMensual = 1000;
        this.montoTotal = 0;

    }

    public boolean Distancia(){

        int distancia = Integer.parseInt(JOptionPane.showInputDialog(null, "Tuvo distancias mayores a 700km en sus pedidos?\n1 = Si, 2 = No"));

        if (distancia == 1){
            return true;
        }else {
            return false;
        }
    }

    public void ServicioGrua(){

        servicioGrua = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de veces que pidio el servicio de grua"));
        if (servicioGrua == 0){
            JOptionPane.showMessageDialog(null, "No ha pedido servicio de Grua");
        }else {
            if (Distancia()){
                do {
                    distanciaGrua = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de veces que excedio la distancia maxima"));
                    if (servicioGrua < distanciaGrua) {
                        JOptionPane.showMessageDialog(null, "ERROR");
                    }
                }while(servicioGrua < distanciaGrua);
            }else {
                distanciaGrua = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su distancia desde el Obelisco en km"));

                distanciaGruaTotal += distanciaGrua;
            }
        }

        if (servicioGrua > 3){
            montoPlus += ((servicioGrua - 3) * 200);
        }
        if (distanciaGrua > 0){
            montoPlus += (distanciaGrua * 200);
        }

        montoGrua += montoPlus;
    }

    public void ServicioCerrajeria(){

        servicioCerrajeria = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de veces que pidio el servicio de cerrajeria"));
        if (servicioCerrajeria == 0){
            JOptionPane.showMessageDialog(null, "No ha pedidio servicio de cerrajeria");
        }else {
            if (servicioCerrajeria > 4){
                montoPlus += ((servicioCerrajeria - 4) * 500);
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

    public int getServicioGrua() {
        return servicioGrua;
    }

    public void setServicioGrua(int servicioGrua) {
        this.servicioGrua = servicioGrua;
    }

    public int getServicioCerrajeria() {
        return servicioCerrajeria;
    }

    public void setServicioCerrajeria(int servicioCerrajeria) {
        this.servicioCerrajeria = servicioCerrajeria;
    }
}