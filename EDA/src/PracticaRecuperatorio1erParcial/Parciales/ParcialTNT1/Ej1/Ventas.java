package PracticaRecuperatorio1erParcial.Parciales.ParcialTNT1.Ej1;

import java.util.ArrayList;
import java.util.List;

public class Ventas {

    Nodo primero;
    Nodo ultimo;
    List<Nodo> ventas;


    public Ventas() {
        this.primero = null;
        this.ultimo = null;
        this.ventas = new ArrayList<>();
    }

    public Ventas(List<Nodo> ventas) {
        this.ventas = ventas;
    }

    public boolean listaVacia(){
        return primero == null;
    }

    public void insertar(String modelo, String color, String cantidadVendida){
        if (listaVacia()){
            Nodo nuevo = new Nodo(modelo, color, cantidadVendida);
            primero = ultimo = nuevo;
        }else {
            Nodo nuevo = new Nodo(modelo, color, cantidadVendida);
            primero = nuevo;
        }
    }

    public void totalModelos(int modelo){
        int modelo1 = 0;
        int modelo2 = 0;
        int modelo3 = 0;
        int modelo4 = 0;
        int modelo5 = 0;
        int modelo6 = 0;
        int modelo7 = 0;
        for (Nodo venta: ventas){
            switch (modelo){
                case 1: modelo1++;
                case 2: modelo2++;
                case 3: modelo3++;
                case 4: modelo4++;
                case 5: modelo5++;
                case 6: modelo6++;
                case 7: modelo7++;
            }
        }
    }
}
