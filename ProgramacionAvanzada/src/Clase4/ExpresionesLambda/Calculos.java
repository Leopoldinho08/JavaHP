package Clase4.ExpresionesLambda;

public class Calculos {

    public static void main(String[] args){

        //Clase Anonima
        ICalculo calculo = new ICalculo() {

            @Override
            public int sumar(int valorA, int valorB) {
                return valorA + valorB;
            }
        };

        System.out.println(calculo.sumar(2,3));

        //Expresion Lambda
        ICalculo calculos = (valorA, valorB) -> {return valorA + valorB;};
        //ICalculo calculos = Integer::sum;  Otra forma de hacerlo
        System.out.println(calculo.sumar(2,2));
    }

}
