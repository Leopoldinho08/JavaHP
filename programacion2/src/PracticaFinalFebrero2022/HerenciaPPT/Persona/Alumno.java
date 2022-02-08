package PracticaFinalFebrero2022.HerenciaPPT.Persona;

public class Alumno extends Persona{

    int matricula;
    String carrera;
    int año_vigencia;

    public static void main(String[] args) {

        Alumno Juan = new Alumno("Juan", 29, "Argentina", 12345, "Ingenieria en informatica", 1989);
        Juan.Imprimir();
    }

    public Alumno(String nombre, int edad, String nacionalidad, int matricula, String carrera, int año_vigencia) {
        super(nombre, edad, nacionalidad);
        this.matricula = matricula;
        this.carrera = carrera;
        this.año_vigencia = año_vigencia;
    }


    public void Imprimir(){
        System.out.println(this.nombre);
        System.out.println(this.edad);
        System.out.println(this.nacionalidad);
        System.out.println(this.matricula);
        System.out.println(this.carrera);
        System.out.println(this.año_vigencia);
    }
}
