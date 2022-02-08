/*Desarrollar una función que dado un número de legajo y una lista enlazada de alumnos de un curso,
ordenada por legajo, cuyos nodos contienen el número de legajo y apellido y nombre, elimine al alumno
de la lista, y retorne un valor verdadero si ello fue posible, de lo contrario un valor falso.
*/
package TPs1erCuatrimestre.TPGrupal.Ej3;


import javax.swing.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Lista {

    public static LinkedList<Nodo> ordenarPorLegajo(LinkedList<Nodo> alumno){

        LinkedList<Nodo> ordenarPorLegajo = new LinkedList<>();

        Collections.sort(alumno, new Comparator<Nodo>() {
            @Override
            public int compare(Nodo o1, Nodo o2) {
                return o1.getLegajo() - o2.getLegajo();
            }
        });

        ordenarPorLegajo.addAll(alumno);

        return ordenarPorLegajo;
    }

    public static boolean eliminar(LinkedList<Nodo> alumno){

        int a = 0;

        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese legajo a eliminar"));

        for (int i = 0; i < alumno.size(); i++){

            if(a == alumno.get(i).getLegajo()){

                JOptionPane.showMessageDialog(null, "Alumno eliminado(legajo): " + a + "\n");
                alumno.remove(i);
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "No se ha encontrado ese legajo.\nNingun alumno fue eliminado");
        return false;
    }

}

