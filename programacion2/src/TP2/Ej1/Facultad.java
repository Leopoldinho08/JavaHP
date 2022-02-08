/*Se tienen una clase facultad que tiene como atributos: el nombre de facultad, cantidad de
carreras. Se pide crear además una subclase que llamaremos carrera, que hereda de la
clase facultad; como atributos propios carrera además tiene: plan_vigente, cant_materias,
nombre_carrera. Realizar una función que muestre por pantalla los datos de una carrera
especifica (instanciar) y el nombre de la facultad al que pertenece.*/
package TP2.Ej1;

public class Facultad {

    static String nombreFacultad;
    static int cantCarreras;

    public Facultad(String nombreFacultad, int cantCarreras) {
        this.nombreFacultad = nombreFacultad;
        this.cantCarreras = cantCarreras;
    }

    public String getNombreFacultad() {
        return nombreFacultad;
    }

    public void setNombreFacultad(String nombreFacultad) {
        this.nombreFacultad = nombreFacultad;
    }

    public int getCantCarreras() {
        return cantCarreras;
    }

    public void setCantCarreras(int cantCarreras) {
        this.cantCarreras = cantCarreras;
    }
}
