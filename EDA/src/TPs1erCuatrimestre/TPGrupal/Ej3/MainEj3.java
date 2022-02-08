/*Desarrollar una función que dado un número de legajo y una lista enlazada de alumnos de un curso,
ordenada por legajo, cuyos nodos contienen el número de legajo y apellido y nombre, elimine al alumno
de la lista, y retorne un valor verdadero si ello fue posible, de lo contrario un valor falso.
*/
package TPs1erCuatrimestre.TPGrupal.Ej3;

import javax.swing.*;
import java.util.LinkedList;

public class MainEj3 {

    public static void main(String[] args) {

        LinkedList<Nodo> alumno = new LinkedList<>();

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad de alumnos"));

        int legajo = 0;
        int item = 0;

        for (int i = 0; i < cantidad; i++) {

            Nodo al = new Nodo();

            String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre del alumno:");
            String apellido = JOptionPane.showInputDialog(null, "Ingrese apellido del alumno:");
            legajo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese legajo del alummo:"));

            al.setNombre(nombre);
            al.setApellido(apellido);
            al.setLegajo(legajo);

            alumno.add(al);
        }

       Lista.ordenarPorLegajo(alumno);

        JOptionPane.showMessageDialog(null, "Ordenar por legajo.\n");
        for (int i = 0; i < cantidad; i++) {
            JOptionPane.showMessageDialog(null, "Alumno " + (i + 1) + ":\n" + "Nombre: " + alumno.get(i).getNombre() +
                    "\nApellido: " + alumno.get(i).getApellido() + "\nLegajo: " + alumno.get(i).getLegajo()
                    + "\n-----------------");

        }
        String otro;
        do {
            Lista.eliminar(alumno);

            for (int i = 0; i < alumno.size(); i++) {
                JOptionPane.showMessageDialog(null, "Alumno " + (i + 1) + ":\n" + "Nombre: " + alumno.get(i).getNombre() +
                        "\nApellido: " + alumno.get(i).getApellido() + "\nLegajo: " + alumno.get(i).getLegajo()
                        + "\n-----------------");

            }

            do {
                otro = JOptionPane.showInputDialog(null, "Desea eliminar otro alumno?\nIngrese Si o No");

                if (!otro.equalsIgnoreCase("si") & !otro.equalsIgnoreCase("no")){
                    JOptionPane.showMessageDialog(null, "Ingrese Si o No");
                }
            }while (!otro.equalsIgnoreCase("si") & !otro.equalsIgnoreCase("no"));


            if (otro.equalsIgnoreCase("si") & alumno.size() == 0){
                JOptionPane.showMessageDialog(null, "No hay mas alumnos para eliminar");
                break;
            }
        } while (otro.equalsIgnoreCase("si"));


    }

}
