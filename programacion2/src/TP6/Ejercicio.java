package TP6;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args){

        System.out.println("1. Programador junior");
        System.out.println("2. Programador senior");
        System.out.println("3. Jefe de proyecto");
        System.out.println("Introduzca el cargo del empleado(1 - 3): ");

        Scanner sc = new Scanner(System.in);

        int cargo = sc.nextInt();

        System.out.println("Cuantos dias ha estado de viaje visitando clientes? ");
        int diasVisita = sc.nextInt();

        System.out.println("Introduzca su estado civil (1 = Soltero, 2 = Casado): ");
        int estadoCivil = sc.nextInt();

        double sueldoBase = 0;

        switch(cargo){
            case 1: //Programador junior
                sueldoBase = 950;
                break;
            case 2: //Programador senior
                sueldoBase = 1200;
                break;
            case 3: //Jefe de proyecto
                sueldoBase = 1600;
                break;
            default:
                System.out.println("No ha elegido correctamente el sueldo base.");
        }

        double sueldoDietas = diasVisita * 30;
        double sueldoBruto = sueldoBase + sueldoDietas;
        double irpf = 0;

        if (estadoCivil ==1){ //Soltero
            irpf = 25;
        }else if(estadoCivil == 2){ //Casado
            irpf = 20;
        }else{
            System.out.println("No ha elegido correctamente el estado civil.");
        }

        double cuantaIrpf = (sueldoBruto * irpf) / 100;

        //Muestra la nomina desglosada

        /*System.out.println("Sueldo base     %7.2f\n", sueldoBase);
        System.out.println("Dietas (%2d viajes) %7.2f\n", diasVisita, sueldoDietas);

        System.out.println("Sueldo bruto    %7.2f\n", sueldoBruto);
        System.out.println("Retencio IRPF (%.0f%%)  %7.2f\n", irpf, cuantaIrpf);

        System.out.println("Sueldo neto     %7.2f\n", sueldoBruto - cuantaIrpf);*/
    }
}
