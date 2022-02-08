package Parcial.Oficial.Ej3;

import javax.swing.*;
import java.util.ArrayList;

import static java.util.Collections.sort;

public class MainEj3 {

    public static void main(String[] args) {

        ArrayList<Videojuego> videojuego = new ArrayList<>();

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Videojuegos: "));

        for (int i = 0; i < cantidad; i++) {

            Videojuego videojuegos = new Videojuego();

            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del videojuego " + (i + 1) + ":");
            int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo del videojuego " + (i + 1) + ":"));
            int cantHoras = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese horas totales del videojuego " + (i + 1) + ":"));
            String compania = JOptionPane.showInputDialog(null, "Ingrese la compañia del videojuego " + (i + 1) + ":");

            videojuegos.setNombre(nombre);
            videojuegos.setCodigo(codigo);
            videojuegos.setHorasTotales(cantHoras);
            videojuegos.setCompania(compania);

            videojuego.add(videojuegos);
        }

        /*Collections.sort(videojuego);

        for (int i = 0; i < cantidad; i++) {
            if (compania.equalsIgnoreCase("ba")) {
                JOptionPane.showMessageDialog(null, Videojuegos.get(i));
            }
        }

    }

    public static void ordenarPorCodigo(ArrayList<Videojuego> videojuegos){

            Collections.sort(videojuegos, new Comparator<Videojuego>() {
                @Override
                public int compare(Videojuego o1, Videojuego o2) {
                    return o1.getCodigo() - o2.getCodigo();
                }
            });
*/
    }
}
