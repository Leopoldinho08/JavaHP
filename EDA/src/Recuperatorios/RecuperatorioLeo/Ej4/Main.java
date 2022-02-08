package Recuperatorios.RecuperatorioLeo.Ej4;

import javax.swing.*;

public class Main {

    public static void main(String[] args){

        Veterinaria veterinaria = new Veterinaria();

        do {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. INGRESAR PACIENTE\n2.MOSTRAR COLA"));
            int urgencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Es una urgencia?"));

            switch (opcion){
                case 1:
                    //veterinaria.insertar();
            }
        }while (true);
    }
}
