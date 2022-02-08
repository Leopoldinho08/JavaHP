package PracticaFinalFebrero2022.ArrayComparablePPT.Persona;

public class Persona implements Comparable<Persona>{

    public int dni;
    public int edad;

    public Persona(int dni, int edad) {
        this.dni = dni;
        this.edad = edad;
    }

    public int compareTo(Persona o) {

        int resultado = 0;

        if (this.edad < o.edad){
            resultado = -1;
        }else if (this.edad > o.edad){
            resultado = 1;
        }else{
            if (this.dni < o.dni){
                resultado = -1;
            }else if (this.dni > o.dni){
                resultado = 1;
            }else {
                resultado = 0;
            }
        }

        return resultado;
    }
}
