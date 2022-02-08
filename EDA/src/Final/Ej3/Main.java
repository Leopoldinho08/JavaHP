package Final.Ej3;

public class Main {
    public static void main(String[] args){
        Ordenamiento ordenar = new Ordenamiento();
        int[] A = {86, 43, 37, 94, 2, 10, 23, 45};
        System.out.print("A = ");
        ordenar.mostrarArray(A);
        int[] B = {2, 33, 34, 12, 15, 3, 5, 7, 9};
        System.out.print("\nB = ");
        ordenar.mostrarArray(B);
        int[] C = {2, 3, 4, 10, 40};
        System.out.print("\nC = ");
        ordenar.mostrarArray(C);
        System.out.println("\n----------------------------");

        int elemento = 45;
        System.out.println("\nBucar elemento '" + elemento + "' en array C: ");
        int resultado = ordenar.busquedaBinaria(C, elemento);
        if (resultado == -1) {
            System.out.println("El elemento no está presente");
        }else {
            System.out.println("Elemento encontrado en el índice " + resultado);
        }

        System.out.println("\n**ORDENAMIENTO POR BURBUJA**");
        System.out.print("A = ");
        ordenar.burbuja(A);
        ordenar.mostrarArray(A);
        System.out.print("\nB = ");
        ordenar.burbuja(B);
        ordenar.mostrarArray(B);

    }

}
