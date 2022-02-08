/*Desarrollar una función que dada dos listas enlazadas simples de
inscripciones, ordenada por código de materia, cuyos nodos contienen el
número de legajo y código de materia, genere una tercera lista como
resultado del apareo de las listas de entrada. Justifique su elección.*/
package Parcial1.T1.punto1;

    public class LinkedList {

        Nodo primero;
        Nodo ultimo;

        public LinkedList() {
            primero = null;
            ultimo = null;

        }

        public void ingresarNodo(int numLegajo, int codMateria) {

            Nodo nuevo = new Nodo();

            nuevo.codMateria = codMateria;
            nuevo.numLegajo = numLegajo;

            if (primero == null) {
                primero = nuevo;
                primero.siguiente = null;
                ultimo = primero;

            } else {
                ultimo.siguiente = nuevo;
                nuevo.siguiente = null;
                ultimo = nuevo;
            }

        }

        public void verListas() {

            Nodo aux = new Nodo();
            aux = primero;
            while (aux != null) {
                System.out.println("Código de materia: " + aux.codMateria + " / Número de legajo de alumno inscripto: " + aux.numLegajo);
                aux = aux.siguiente;
            }
        }

        public void add(int numLegajo, int codMateria) {
            primero = new Nodo(numLegajo, codMateria, primero);
            if(ultimo == null){
                ultimo = primero;
            }
        }

    }