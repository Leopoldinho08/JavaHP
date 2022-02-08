package PracticaFinal.Recursividad;

public class TorreDeHanoi {

    public static void main(String[] args){
        TorreDeHanoi torreDeHanoi = new TorreDeHanoi();
        torreDeHanoi.torreHanoiRecursivo(3, 1, 2, 3);
        System.out.println("JUEGO COMPLETADO");
    }

    public void torreHanoiRecursivo(int discos, int torre1, int torre2, int torre3){
        if (discos == 1){
            System.out.println("Mover disco de Torre " + torre1 + " a Torre " + torre3);
        }else {
            torreHanoiRecursivo(discos - 1, torre1, torre3, torre2);
            System.out.println("Mover disco de Torre " + torre1 + " a Torre " + torre3);
            torreHanoiRecursivo(discos - 1, torre2, torre1, torre3);
        }
    }
}
