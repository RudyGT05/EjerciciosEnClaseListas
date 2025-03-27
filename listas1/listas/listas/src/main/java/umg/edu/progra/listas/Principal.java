package umg.edu.progra.listas;

import umg.edu.progra.listas.doblementeEnlazada.DoblementeEnlazada;

/**
 *
 * @author Walter Cordova
 */
public class Principal {

    public static void main(String[] args) {

DoblementeEnlazada lista = new DoblementeEnlazada();
        
    
        lista.insertAtEnd(10);
        lista.insertAtEnd(20);
        lista.insertAtEnd(30);
        
        System.out.println("Lista original:");
        lista.displayForward();

        // Prueba 1: contarNodos()
        System.out.println(" Total de nodos: " + lista.contarNodos());
        
        // Prueba 2: insertarDespuesDe()
        System.out.println("Insertando 15 después de 10:");
        lista.insertarDespuesDe(10, 15);
        lista.displayForward();
        
        // Prueba 3: revertir()
        System.out.println("Lista revertida:");
        lista.revertir();
        lista.displayForward();
        /*
        Lista lista = new Lista();
        lista.insertarCabezaLista(1);
        lista.insertarCabezaLista(2);
        lista.insertarCabezaLista(3);
        lista.insertarCabezaLista(4);
        lista.insertarCabezaLista(5);
        lista.insertarCabezaLista(6);
        
        lista.visualizar();        
        
        
        System.out.println("\n");
        System.out.println("primero : " + lista.leerPrimero());
        
        
        
        lista.eliminar(3);
        System.out.println("lista: " + lista);
        
        System.out.println("\n");
        
        Nodo dato = lista.buscarLista(4);  
        System.out.println("dato: " + dato );
        
        lista.insertarLista(dato, 10);
        System.out.println("lista " + lista);
        
        dato = lista.buscarLista(5);        
        System.out.println("dato " + dato);
        lista.insertarLista(dato, 600);
        
        System.out.println("lista " + lista);
        
        lista.visualizar();
        */
    }
        
        /**
         * Ejercicio 1: Ordernar la lista de forma ascendente
         * Ejercicio 2: Unir dos listas enlazadas
         * Ejercicio 3: Separa numeros pares e impares en dos listas enlazadas diferentes
         */
        

    }


