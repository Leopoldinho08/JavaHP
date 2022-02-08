package Parcial2;

public class QuickSort {

        public static void main(String[] args){
            int[] arr = {12,34,22,64,34,33,23,64,33};
            int i = 0;
            int j = arr.length;
            while(i < j){
                i = quickSort(arr, i,i+1,j-1);

            }
            for(i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }

        }

        public static int quickSort(int[] arr, int pivot, int i, int j){

            if(i > j) {
                swap(arr, pivot, j);
                return i;
            }

            while(i < arr.length && arr[i] <= arr[pivot]) {
                i++;
            }

            while(j >= 1 && arr[j] >= arr[pivot]) {
                j--;
            }
            if(i < j)
                swap(arr, i, j);

            return quickSort(arr, pivot, i, j);

        }
        public static void swap(int[] arr,int i,int j) {
            int aux;
            aux = arr[i];
            arr[i] = arr[j];
            arr[j] = aux;
        }
}