package PracticaFinal.FinalJulioT1;

public class Estudiante {

    public String nombre;
    public boolean virtual;

    public Estudiante(String nombre, boolean virtual) {
        this.nombre = nombre;
        this.virtual = virtual;
    }

    public boolean claseVirtual(boolean virtual){
        virtual = false;
        if (!virtual){
            virtual = true;
        }
        return virtual;
    }
}
