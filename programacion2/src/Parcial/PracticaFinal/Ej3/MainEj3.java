package Parcial.PracticaFinal.Ej3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainEj3 {

    public static void main(String[] args){

        ArrayList<Videojuego> listaVideojuegos = new ArrayList<>();
        String seguir = null;

        do {
            Videojuego videojuego = new Videojuego();
            String nombre = JOptionPane.showInputDialog(null,
                    "Ingrese videojuego: ");
            int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese su código: "));
            int horasTotales = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese las horas totales jugadas: "));
            String compania = JOptionPane.showInputDialog(null,
                    "Ingrese la compañía: ");
            videojuego.setNombre(nombre);
            videojuego.setCodigo(codigo);
            videojuego.setHoras_totales(horasTotales);
            videojuego.setCompania(compania);

            listaVideojuegos.add(videojuego);

            do {
                seguir = JOptionPane.showInputDialog(null,
                        "¿Desea ingresar otro Videojuego?\n" +
                                "(S/N)");
                if (!seguir.equalsIgnoreCase("S") && !seguir.equalsIgnoreCase("N")){
                    JOptionPane.showMessageDialog(null,
                            "Error. Debe ingresar S o N",
                            "Opcion incorrecta", JOptionPane.INFORMATION_MESSAGE);
                }
            }while (!seguir.equalsIgnoreCase("S") && !seguir.equalsIgnoreCase("N"));
            if (seguir.equalsIgnoreCase("N")){
                listaVideojuegos.sort(new Comparator<Videojuego>() {
                    @Override
                    public int compare(Videojuego o1, Videojuego o2) {
                        return Integer.compare(o1.codigo, o2.codigo);
                    }
                });
                for (int i = 0; i < listaVideojuegos.size(); i++){
                    System.out.println("Videojuego: " + listaVideojuegos.get(i).getNombre() +
                            "\nCódigo: " + listaVideojuegos.get(i).getCodigo() +
                            "\nCantidad de horas jugadas: " + listaVideojuegos.get(i).getHoras_totales() +
                            "\nCompañia: " + listaVideojuegos.get(i).getCompania() +
                            "\n---------------------------------------");
                }
                System.out.println("Los videojuegos que son de la compañia BA son: ");
                for (int i = 0; i < listaVideojuegos.size(); i++){
                    if (listaVideojuegos.get(i).getCompania().equalsIgnoreCase("BA")){
                        System.out.println(listaVideojuegos.get(i).getNombre().toUpperCase());
                    }
                }
            }
        }while (seguir.equalsIgnoreCase("S"));
    }
}
