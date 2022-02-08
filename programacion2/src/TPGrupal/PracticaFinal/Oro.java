package TPGrupal.PracticaFinal;

public class Oro extends Cliente{

    public Oro() {
        super();
        this.mensual = 1000;
    }

    @Override
    int servicioGrua(int cantidadGrua, int distanciaMax, int pagoTotalGrua) {
        if (cantidadGrua > 3 || distanciaMax > 700){
            pagoTotalGrua = pagoTotalGrua + 200;
        }
        return pagoTotalGrua;
    }

    @Override
    int servicioCerrajeria(int cantidadCerrajero, int pagoTotalCerrajero) {
        if (cantidadCerrajero > 4){
           pagoTotalCerrajero = (cantidadCerrajero - 4) + 500;
        }
        return pagoTotalCerrajero;
    }

    @Override
    int pagoFinal() {
        return getPagoTotalGrua() + getPagoTotalCerrajero() + getMensual();
    }

}
