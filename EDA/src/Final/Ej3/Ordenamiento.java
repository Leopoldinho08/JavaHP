package Final.Ej3;

public class Ordenamiento {

    public void burbuja(int[] array){
        int aux;
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] < array[j]){
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
    }

    public int busquedaBinaria(int[] array, int elemento) {
        int izquierdo = 0;
        int derecho = array.length - 1;
        while (izquierdo <= derecho) {
            int medio = izquierdo + (derecho - izquierdo) / 2;
            if (array[medio] == elemento){
                return medio;
            }

            if (array[medio] < elemento) {
                izquierdo = medio + 1;
            }else{
                derecho = medio - 1;
            }
        }
        return -1;
    }

    public void mostrarArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print("[" + array[i] + "]");
        }
    }
}
