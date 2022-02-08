package TPs2doCuatrimestre.Ordenamiento;

public class Ordenamiento {

    public void seleccion(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[minimo]){
                    minimo = j;
                }
            }
            int aux = array[i];
            array[i] = array[minimo];
            array[minimo] = aux;
        }
    }

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

    public void OrdenarPorInsersion() {
        int[] array = new int[100];
        int aux;
        for (int i = 1; i < 100; i++){
            aux = array[i];
            int j = i - 1;
            while((j >= 0) && array[j] > aux){
                array[j+1] = array[j--];
                array [j+1] = aux;
            }
        }
    }
    public void mostrarArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print("[" + array[i] + "]");
        }
    }
}
