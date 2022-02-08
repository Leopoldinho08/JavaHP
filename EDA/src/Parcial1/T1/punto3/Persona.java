package Parcial1.T1.punto3;

public class Persona {

    private char sexo;
    private int DiaNac;
    private int MesNac;
    private int AñoNac;

    public Persona(int dia, int mes, int año, char sexo) {
        this.DiaNac = dia;
        this.MesNac = mes;
        this.AñoNac = año;
        this.sexo = sexo;

    }

    public int getEdad() {

        int edadAño = 365 * (2020 - this.AñoNac);
        int edadMes = 30 * MesNac;
        int edadDia = 30 - DiaNac;
        int edad = edadDia + edadAño + edadMes;

        return edad;
    }

    public int getDiaNac() {
        return DiaNac;
    }

    public int getMesNac() {
        return MesNac;
    }

    public int getAñoNac() {
        return AñoNac;
    }

    public char getSexo() {
        return sexo;
    }
}
