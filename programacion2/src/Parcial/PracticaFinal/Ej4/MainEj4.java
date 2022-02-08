package Parcial.PracticaFinal.Ej4;

import javax.swing.*;

public class MainEj4 {

    public static void main(String[] args){

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de materias"));

        Materia[] planEstudio = new Materia[cantidad];

        for (int i = 0; i < cantidad; i++){
            String nombreMateria = JOptionPane.showInputDialog(null,
                    "Ingrese nombre de la materia " + i + ": ");
            try {
                int anoPlan = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingrese el año del plan: "));
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
            }
            String carrera = JOptionPane.showInputDialog(null,
                    "Ingrese la carrera: ");
            boolean esPromocionable = Boolean.parseBoolean(JOptionPane.showInputDialog(null,
                    "Es promocionable?\nTRUE o FALSE"));
        }
        promocionables(planEstudio);
        anoPlanUltimo(planEstudio);
    }

    public static void promocionables(Materia[] planEstudio){
        for (int i = 0; i < planEstudio.length; i++){
            if (planEstudio[i].getAno_plan() == 5){
                JOptionPane.showMessageDialog(null,
                        "La materia: " + planEstudio[i].getNombre() + "pertenece al último año");
            }
        }
    }

    public static void anoPlanUltimo(Materia[] planEstudio) {
        for (int i = 0; i < planEstudio.length; i++){
            if (planEstudio[i].isPromocionable()){
                JOptionPane.showMessageDialog(null,
                        "La materia: " + planEstudio[i].getNombre() + "no es promocionable");
            }
        }
    }
}
