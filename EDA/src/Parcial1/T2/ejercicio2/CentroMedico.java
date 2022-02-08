package Parcial1.T2.ejercicio2;

import java.util.Queue;

public class CentroMedico {

    private Queue<Integer> trauma;
    private Queue<Integer> pediatra;
    private Queue<Integer> neuro;

    public CentroMedico(Queue<Integer> trauma, Queue<Integer> pediatra, Queue<Integer> neuro) {
        this.trauma = trauma;
        this.pediatra = pediatra;
        this.neuro = neuro;
    }

    public void anotarPaciente(int dni, String especialidad) {

        switch (especialidad) {
            case "tra":
                trauma.add(dni);
                System.out.println("El paciente de dni + " + trauma.peek() + " fue agregado a la cola.");

            case "ped":
                pediatra.add(dni);
                System.out.println("El paciente de dni + " + pediatra.peek() + " fue agregado a la cola.");

            case "neu":
                neuro.add(dni);
                System.out.println("El paciente de dni + " + neuro.peek() + " fue agregado a la cola.");

            default:
                System.out.println("No trabajamos con esa especialidad.");
        }
    }

    public void pacienteAtendido(String especialidad) {

        switch (especialidad) {
            case "tra":
                System.out.println("El paciente de dni + " + trauma.peek() + " fue atendido.");
                trauma.remove();

            case "ped":
                System.out.println("El paciente de dni + " + pediatra.peek() + " fue atendido.");
                pediatra.remove();

            case "neu":
                System.out.println("El paciente de dni + " + neuro.peek() + " fue atendido.");
                neuro.remove();

            default:
                System.out.println("No hay mas pacientes en la cola.");
        }
    }

}
