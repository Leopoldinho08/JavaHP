package Parcial.Oficial.Ej4;

import javax.swing.*;

public class MainEj4 {

    public static void main(String[] args){

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad de materias"));

        Materia[] planDeEstudio = new Materia[cantidad];

        for (int i = 0; i < cantidad; i++){

            String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre de la materia");
            int anoPlan = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año del plan"));
            String carrera = JOptionPane.showInputDialog(null, "Ingrese nombre de la carrera");
            boolean promocionable = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Es promocionable?"));

        }

        materiasUltimoAño(planDeEstudio);
        materiasNoPromocionables(planDeEstudio);


    }
    public static void materiasUltimoAño(Materia[] planDeEstudio){
        for (int i = 0; i < planDeEstudio.length; i++){
            if (planDeEstudio[i].getAño_plan() == 5){
                System.out.println("La materia " + planDeEstudio[i].getNombre() + " pertence al ultimo año");
            }
            i++;
        }
    }


    public static void materiasNoPromocionables (Materia[] planDeEstudio){
        for (int i = 0; i < planDeEstudio.length; i++){
            if (! planDeEstudio[i].isPromocionable()){
                System.out.println("La materia " + planDeEstudio[i].getNombre() + " no es promocionable");
            }
            i++;
        }
    }
}
