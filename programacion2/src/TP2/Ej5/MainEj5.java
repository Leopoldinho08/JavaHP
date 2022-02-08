/*Usando constructores se pide que se realice el siguiente programa. Se ha presentado la
necesidad de guardar los datos de los alumnos de una facultad. Se pide se muestre por
pantalla los datos de un alumno dado que hereda de la clase persona los atributos de
nombre, edad, nacionalidad. Como atributos propios alumno tiene: matricula, carrera,
año_vigencia. Dichos datos son recibidos por parámetros.
Se pide mostrar por pantalla los datos de un alumno dado.*/
package TP2.Ej5;

public class MainEj5 {
    public static void main(String[] args){
        Alumno alumno = new Alumno("Leonardo Pereira", 20,"Argentina", 15948,
                "Lic.Sistemas de Informacion", 2019);

        System.out.println("ALUMNO");
        System.out.println("Nombre: " + alumno.getNombre() + "\nEdad: " + alumno.getEdad() + "\nNacionalidad: " +
                alumno.getNacionalidad() + "\nMatricula: " + alumno.getMatricula() + "\nCarrera: " + alumno.getCarrera() +
                "\nAño de vigencia: " + alumno.getAno_vigencia());
    }
}
