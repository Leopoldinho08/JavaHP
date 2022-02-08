/*Se tienen una clase facultad que tiene como atributos: el nombre de facultad, cantidad de
carreras. Se pide crear además una subclase que llamaremos carrera, que hereda de la
clase facultad; como atributos propios carrera además tiene: plan_vigente, cant_materias,
nombre_carrera. Realizar una función que muestre por pantalla los datos de una carrera
especifica (instanciar) y el nombre de la facultad al que pertenece.*/
package TP2.Ej1;
import java.util.Scanner;

public class Carrera extends Facultad{
    private static int plan_vigente;
    private static int cant_materias;
    private static String nombre_carrera;

    public Carrera(String nombreFacultad, int cantCarreras, int plan_vigente, int cant_materias, String nombre_carrera) {
        super(nombreFacultad, cantCarreras);
        this.plan_vigente = Carrera.plan_vigente;
        this.cant_materias = Carrera.cant_materias;
        this.nombre_carrera = nombre_carrera;
    }

    public int getPlan_vigente() {
        return plan_vigente;
    }

    public void setPlan_vigente(int plan_vigente) {
        this.plan_vigente = plan_vigente;
    }

    public int getCant_materias() {
        return cant_materias;
    }

    public void setCant_materias(int cant_materias) {
        this.cant_materias = cant_materias;
    }

    public String getNombre_carrera() {
        return nombre_carrera;
    }

    public void setNombre_carrera(String nombre_carrera) {
        this.nombre_carrera = nombre_carrera;
    }
    private static Scanner sc;

    public static void main(String[] args){
        /*
        sc = new Scanner(System.in);

        Carrera carrera1 = new Carrera(nombreFacultad, cantCarreras, plan_vigente, cant_materias, nombre_carrera );
        System.out.println("Ingrese su Facultad: ");
        Facultad.nombreFacultad = sc.nextLine();
        System.out.println("Ingrese cantidad de carreras: ");
        Facultad.cantCarreras = sc.nextInt();
        System.out.println("Ingrese su plan: ");
        Carrera.plan_vigente = sc.nextInt();
        System.out.println("Ingrese cantidad de materias: ");
        Carrera.cant_materias = sc.nextInt();
        System.out.println("Ingrese el nombre de la carrera: ");
        Carrera.nombre_carrera = sc.nextLine();
*/
        Carrera carrera1 = new Carrera("Universidad del Salvador", 29, 2, 6,"Ingenieria en informatica" );
        Facultad facultad1 = new Facultad("El Salvador", 9);

        System.out.println("Nombre facultad: " + facultad1.getNombreFacultad() + "\nCantidad de carreras: " + facultad1.getCantCarreras());
        System.out.println("Nombre de la carrera: " + carrera1.getNombre_carrera());

    }
}
