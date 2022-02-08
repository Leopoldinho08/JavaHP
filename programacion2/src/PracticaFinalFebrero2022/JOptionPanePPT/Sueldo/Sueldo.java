package PracticaFinalFebrero2022.JOptionPanePPT.Sueldo;

import java.util.Scanner;

public class Sueldo {

    public static void main(String[] args) {

        System.out.println(" 1. Prog. Junior");
        System.out.println(" 2. Prog. Senior");
        System.out.println(" 3. Jefe de Proyecto");
        System.out.println("Introduzca el cargo del empleado (1-3)");
        Scanner scanner = new Scanner(System.in);

        int cargo = scanner.nextInt();

        System.out.println("¿Cuantos dias Ha estado de viaje visitando clientes?");
        int diasVisita = scanner.nextInt();

        System.out.println("Introduzca estado civil \n(1. Soltero, 2. Casado)");
        int estadoCivil = scanner.nextInt();

        double sueldoBase = 0;

        switch (cargo) {
            case 1 -> //Prog. Junior
                    sueldoBase = 950;
            case 2 -> //Prog. Senior;
                    sueldoBase = 1200;
            case 3 -> //Jefe de Proyecto
                    sueldoBase = 1600;
            default -> System.out.println("No ha elegido correctamente el sueldo base.");
        }

        double sueldoDietas = diasVisita * 30;

        double sueldoBruto = sueldoBase + sueldoDietas;

        double irpf = 0;

        if (estadoCivil == 1){ //Soltero
            irpf = 25;
        }else if (estadoCivil == 2){
            irpf = 20;
        }else {
            System.out.println("No ha elegido correctamente el estado civil. ");
        }

        double cuantiaIrpf = (sueldoBruto * irpf) / 100;

        System.out.printf("Sueldo base             %7.2f\n", sueldoBase);
        System.out.printf("Dietas (%2d viajes)     %7.2f\n", diasVisita, sueldoDietas);

        System.out.printf("Sueldo bruto            %7.2f\n", sueldoBruto);
        System.out.printf("Retencion IRPF (%.0f%%)   %7.2f\n", irpf, cuantiaIrpf);

        System.out.printf("Sueldo neto             %7.2f\n", sueldoBruto - cuantiaIrpf);
    }
}
