package PracticaFinalFebrero2022.ArrayComparablePPT.Persona;

public class PersonaMain {

    public static void main(String[] args) {

        Persona p1 = new Persona(42103294, 22);
        Persona p2 = new Persona(42076758, 22);

        if (p1.compareTo(p2) < 0){
            System.out.println("La persona p1 es Menor");
        } else if (p1.compareTo(p2) > 0){
            System.out.println("La persona p1 es Mayor");
        } else {
            System.out.println("Son un clon!");
        }
    }
}
