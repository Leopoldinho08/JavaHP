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

import javax.swing.text.DateFormatter;
import java.awt.event.PaintEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Censo {

    private List<Persona> listaGente;
    private String name;

    public Censo() {
        this.listaGente = new ArrayList<>();
    }

    public Censo(List<Persona> listaGente) {
        this.listaGente = listaGente;
    }

    public void startCensus(){
        System.out.println("\nCENSO REALIZADO");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Persona> nacidosAntes9DeJulio1970(){
        List<Persona> nacidosAntes9deJulio1970 = new ArrayList<>();
        for (Persona persona: listaGente){
            if ((persona.getAñoNac() <= 1970) && (persona.getMesNac() == 7) && (persona.getDiaNac() <= 9)){
                nacidosAntes9deJulio1970.add(persona);
            }
        }
        return nacidosAntes9deJulio1970;
    }

    public int nacidosOctubre(){
        List<Persona> nacidoOctubre = new ArrayList<>();
        int contadorOctubre = 0;
        for (Persona persona: listaGente){
            if (persona.getMesNac() == 10){
                contadorOctubre++;
            }
        }
        return contadorOctubre;
    }

    public List<Persona> mujeresNacPrimavera1942(){
        List<Persona> mujeresPrimaver1942 = new ArrayList<>();
        for (Persona persona: listaGente){
            if (persona.getSexo() == 'F'){
                if ((persona.getAñoNac() == 1942)){
                    if ((persona.getMesNac() >= 9) && (persona.getDiaNac() >= 21)){
                        if ((persona.getMesNac() == 12) & (persona.getDiaNac() < 21)){
                            mujeresPrimaver1942.add(persona);
                        }
                    }

                }
            }
        }
        return mujeresPrimaver1942;
    }

    /*public char sexoPersonaMAsAnciana(){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(Persona.getDiaNac());
        Persona masAnciana = listaGente.get(0);
        for (Persona persona: listaGente){
            if ()
        }
    }*/
    /*Persona[] censo;

    public Censo() {
        Persona[] censo = new Persona[40000];
    }

    public int nacimientoOctubre() {
        int i = 0;

        for (int j = 0; j < censo.length; j++) {
            if (censo[j].getMes() == 10) {
                i++;
            }
        }

        return i;

    }

    public int nacimientosPrevios70 (){
        int i = 0;

        for (int j = 0; j < censo.length; j++){
            if (censo[j].getFechaNacimiento() < 19700709){
                i++;
            }
        }

        return i;
    }

    public int nacimientosMujeres42 (){
        int i = 0;

        for (int j = 0; j < censo.length; j++){
            if (censo[j].getAño() == 1942){
                if (censo[j].getSexo() == "F"){
                    i++;
                }
            }
        }

        return i;
    }

    public String sexoAnciano (){
        int añoPersona = 3000;
        String sexoPersona = null;

        for (int j = 0; j < censo.length; j++){
            if (censo[j].getAño() < añoPersona){
                añoPersona = censo[j].getAño();
                sexoPersona = censo[j].getSexo();
            }
        }

        return sexoPersona;

    }*/

}
