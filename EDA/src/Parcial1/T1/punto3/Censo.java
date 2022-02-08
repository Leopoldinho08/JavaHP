package Parcial1.T1.punto3;

import java.util.ArrayList;
import java.util.List;

public class Censo {

    private List<Persona> listaDeGente;
    private String name;

    public Censo() {
        this.listaDeGente = new ArrayList<>();

    }

    public Censo(List<Persona> listOfPeople) {
        this.listaDeGente = listOfPeople;
    }

    public void startCensus(){
        System.out.println("\nCENSO REALIZADO");

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<Persona> nacidosEnOctubre(){

        List<Persona> peopleBornInOctober = new ArrayList<>();
        for (Persona people : listaDeGente) {
            if (people.getMesNac() == 10) {
                peopleBornInOctober.add(people);
            }

        }

        return peopleBornInOctober;

    }

    public List<Persona> nacidosAntesDelNueveDeJulio1970() {

        List<Persona> peopleBornBeforeJuly9th1970 = new ArrayList<>();
        for (Persona people: listaDeGente) {
            if (people.getAñoNac() < 1970) {
                peopleBornBeforeJuly9th1970.add(people);

            }
            if (people.getAñoNac() == 1970 && people.getMesNac() == 6 ) {
                peopleBornBeforeJuly9th1970.add(people);

            }
            if (people.getAñoNac() == 1970 && people.getMesNac() == 7 && people.getDiaNac() <= 9) {
                peopleBornBeforeJuly9th1970.add(people);

            }

        }

        return peopleBornBeforeJuly9th1970;

    }

    public List<Persona> mujeresNacidasPrimavera1942() {

        List<Persona> womenBornSpring1942 = new ArrayList<>();
        for (Persona people : listaDeGente) {
            if (people.getSexo() == 'F') {
                if (people.getAñoNac() == 1942 && people.getMesNac() == 9 && people.getDiaNac() >= 21) {
                    womenBornSpring1942.add(people);

                }
                if (people.getAñoNac() == 1942 && people.getMesNac() == 12 && people.getDiaNac() <= 21) {
                    womenBornSpring1942.add(people);
                }
                if (people.getAñoNac() == 1942 && (people.getMesNac() == 10 || people.getDiaNac() == 11)) {
                    womenBornSpring1942.add(people);

                }
            }
        }

        return womenBornSpring1942;

    }

    public char sexoPersonaMasAnciana() {

        Persona masAnciana = listaDeGente.get(0);
        for (Persona people: listaDeGente) {
            if (people.getEdad() <= masAnciana.getEdad()) {
                masAnciana = people;

            }
        }
        return masAnciana.getSexo();

    }


    public void anotherOne(Persona people) {
        listaDeGente.add(people);

    }
}