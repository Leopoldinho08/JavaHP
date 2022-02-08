package Parcial1.TNMatias.Ejercicio1;

public class Consulta {
    private int codigoLibro;
    private String fechaConsulta; //aaaammdd

    public Consulta(int codigoLibro, String fechaConsulta) {
        this.codigoLibro = codigoLibro;
        this.fechaConsulta = fechaConsulta;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public void setFechaConsulta(String fechaConsulta) {
        String year = fechaConsulta.substring(0,4);
        String mes = fechaConsulta.substring(4,6);
        String dia = fechaConsulta.substring(6,8);

        if(!"2020".equals(year))
            throw new RuntimeException("Debe ser el year actual");
        else if(Integer.parseInt(mes) >= 6 || Integer.parseInt(mes) <= 1)
            throw  new RuntimeException("Debe ser el primer semestre");
        else if(Integer.parseInt(dia) >= 31 || Integer.parseInt(dia) <= 1)
            throw new RuntimeException("Error en el dia");

        this.fechaConsulta = fechaConsulta;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }
}
