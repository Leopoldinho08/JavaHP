package TPs2doCuatrimestre.Ordenamiento;

public class Main {
    public static void main(String[] args){
        Ordenamiento ordenar = new Ordenamiento();
        int[] A = {10, 20, 3, 33, 2, 1, 23, 45};
        int[] B = {2, 33, 34, 12, 15, 3, 5, 7, 9};
        int[] C = {34, 45, 6, 55, 4, 2, 7, 90};
        int[] D = {32, 12, 10, 9, 55, 66, 43};
        int[] E = {34, 2, 1, 45, 6, 7, 4, 5};
        int[] F = {22, 20, 30, 10, 40, 50, 3};
        int[] G = {90,66,77,5,44,3,88,99};

        System.out.println("**ORDENAMIENTO POR BURBUJA**");
        System.out.print("A = ");
        ordenar.burbuja(A);
        ordenar.mostrarArray(A);
        System.out.print("\nB = ");
        ordenar.burbuja(B);
        ordenar.mostrarArray(B);
        System.out.print("\nC = ");
        ordenar.burbuja(C);
        ordenar.mostrarArray(C);
        System.out.print("\nD = ");
        ordenar.burbuja(D);
        ordenar.mostrarArray(D);
        System.out.print("\nE = ");
        ordenar.burbuja(E);
        ordenar.mostrarArray(E);
        System.out.print("\nF = ");
        ordenar.burbuja(F);
        ordenar.mostrarArray(F);
        System.out.println("----------------------------");

    }

}
