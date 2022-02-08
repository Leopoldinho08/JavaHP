package PracticaFinal.Recursividad;

public class Fibonacci {

    public static void main(String[] args){
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("La sucesion Fibonacci de 12 mediante método Recursivo es: " +
                fibonacci.FibonacciRecursivo(12));
        System.out.println("La sucesion Fibonacci de 12 mediante método Cíclico es: " +
                fibonacci.FibonacciCiclico(12));
    }

    public int FibonacciRecursivo(int n){
        if (n == 1 || n == 2){
            return 1;
        }else {
            return FibonacciRecursivo(n - 1) + FibonacciRecursivo(n - 2);
        }
    }

    public int FibonacciCiclico(int n){
        int fibo = 0;
        int primero = 1;
        int segundo = 0;
        while (n > 0){
            fibo = primero + segundo;
            primero = segundo;
            segundo = fibo;
            n--;
        }
        return fibo;
    }
}
