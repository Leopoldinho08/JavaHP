/*Del censo realizado en una población se conocen los siguientes datos:
a) Día de nacimiento (2 dígitos) b) Mes de nacimiento (2 dígitos)
c) Año de nacimiento (2 dígitos) d) Sexo (‘M’: masculino / ‘F’: femenino)
Con estos datos de cada habitante se forma un lote finalizado con un día
cero. Desarrollar el programa (COD o pseudocódigo) que determine e
imprima:
1) Cuantos nacimientos hubo en el mes de octubre de todos los años.
2) Cuantos nacimientos hubo antes del 9 de julio de 1970.
3) Cuantos nacimientos de mujeres hubo en la primavera de 1942.
4) Sexo de la persona más anciana (solo existe una).*/
package Parcial1.T1.Ej3;

public class Persona {
    int diaNac;
    int mesNac;
    int añoNac;
    char sexo;

    public Persona(int diaNac, int mesNac, int añoNac, char sexo) {
        this.diaNac = diaNac;
        this.mesNac = mesNac;
        this.añoNac = añoNac;
        this.sexo = sexo;
    }

    public void getEdad(){
        int edadAno = 365 * (2020 - this.añoNac);
        int edadMes = 30 * mesNac;
        int edadDia = 30 - diaNac;

    }

    public int getDiaNac() {
        return diaNac;
    }

    public void setDiaNac(int diaNac) {
        this.diaNac = diaNac;
    }

    public int getMesNac() {
        return mesNac;
    }

    public void setMesNac(int mesNac) {
        this.mesNac = mesNac;
    }

    public int getAñoNac() {
        return añoNac;
    }

    public void setAñoNac(int añoNac) {
        this.añoNac = añoNac;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
