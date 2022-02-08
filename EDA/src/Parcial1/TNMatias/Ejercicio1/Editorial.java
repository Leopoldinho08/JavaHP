package Parcial1.TNMatias.Ejercicio1;

public class Editorial implements Comparable<Editorial>{
    private String nombre; //25 c
    private int codigo; //1...200 d

    public Editorial(String nombre, int codigo) {
        setNombre(nombre);
        setCodigo(codigo);
    }

    public void setNombre(String nombre) {
        if(nombre.length() >= 25)
            throw new RuntimeException("Nombre debe tener 25 c max");
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        if(String.valueOf(codigo).length() <= 1 && String.valueOf(codigo).length() >= 200)
            throw new RuntimeException("Codigo debe tener entre 1 y 200 d");
        this.codigo = codigo;
    }


    @Override
    public int compareTo(Editorial o) {
        return nombre.compareTo(o.nombre);
    }
}
