package Parcial1.T1.punto3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Punto3Main {

    public static void main(String[] args) {

        Persona Hugo = new Persona(6, 3, 1995, 'M');
        Persona Ignacio = new Persona(24,12,1961, 'M');
        Persona Nicolas = new Persona(15,7,1984, 'M');
        Persona Christian = new Persona(13,4,1999, 'M');
        Persona Carolina = new Persona(3, 3, 1969, 'F');
        Persona Ailin = new Persona(21, 10, 1942, 'F');
        Persona Nanci = new Persona(3, 6, 1937, 'F');

        List<Persona> list = new ArrayList<Persona>(Arrays.asList(Hugo, Ignacio, Nicolas, Christian, Carolina, Ailin, Nanci));

        Censo CensoPoblational = new Censo(list);

        CensoPoblational.startCensus();

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Personas nacidas en el mes de octubre: " + (CensoPoblational.nacidosEnOctubre()).size());

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Personas nacidas antes del 9/7/1970: " + CensoPoblational.nacidosAntesDelNueveDeJulio1970().size());

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Mujeres nacidas en primavera del 1942: " + CensoPoblational.mujeresNacidasPrimavera1942().size());

        System.out.println("-----------------------------------------------------------------------------------------");

        if(CensoPoblational.sexoPersonaMasAnciana() == 'M'){

            System.out.println("Género de la persona más grande:  Masculino");

        }else{

            System.out.println("Género de la persona más grande: Femenino");

        }


    }

}
