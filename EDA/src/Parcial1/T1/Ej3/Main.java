/*Del censo realizado en una población se conocen los siguientes datos:
a) Día de nacimiento (2 dígitos) b) Mes de nacimiento (2 dígitos)
c) Año de nacimiento (2 dígitos) d) Sexo (‘M’: masculino / ‘F’: femenino)
Con estos datos de cada habitante se forma un lote finalizado con un día
cero. Desarrollar el programa (COD o pseudocódigo) que determine e
imprima:
1) Cuantos nacimientos hubo en el mes de octubre de todos los años.
2) Cuantos nacimientos hubo antes del 9 de julio de 1970.
3) Cuantos nacimientos de mujeres hubo en la primavera de 1942.
4) Sexo de la persona más anciana (solo existe una).*/
package Parcial1.T1.Ej3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){

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
        System.out.println("Nacimientos en el mes de Octubre: " + (CensoPoblational.nacidosOctubre()));

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Personas nacidas antes del 9/7/1970: " + CensoPoblational.nacidosAntes9DeJulio1970().size());

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Mujeres nacidas en primavera del 1942: " + CensoPoblational.mujeresNacPrimavera1942().size());

        System.out.println("-----------------------------------------------------------------------------------------");

        /*if(CensoPoblational.sexoPersonaMasAnciana() == 'M'){
            System.out.println("Género de la persona más grande:  Masculino");
        }else{
            System.out.println("Género de la persona más grande: Femenino");
        }*/
    }
}
