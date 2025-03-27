

import umg.edu.progra.listas.doblementeEnlazada.DoblementeEnlazada;

public class Principal {

    public static void main(String[] args) {
        // Crear una instancia de la lista doblemente enlazada
        DoblementeEnlazada lista = new DoblementeEnlazada();
        
        // Insertar elementos al final
        lista.insertAtEnd(10);
        lista.insertAtEnd(20);
        lista.insertAtEnd(30);
        
        // Insertar elementos al principio
        lista.insertAtBeginning(5);
        lista.insertAtBeginning(0);
        
        // Mostrar la lista hacia adelante
        System.out.println("Lista hacia adelante:");
        lista.displayForward();
        
        // Mostrar la lista hacia atrás
        System.out.println("Lista hacia atrás:");
        lista.displayBackward();
        
        // Eliminar un elemento de la lista
        lista.delete(20);
        System.out.println("Lista después de eliminar 20:");
        lista.displayForward();
        
        // Buscar un elemento en la lista
        boolean encontrado = lista.search(10);
        System.out.println("¿Se encontró el 10 en la lista? " + encontrado);
        
        // Contar el número de nodos en la lista
        int totalNodos = lista.contarNodos();
        System.out.println("Número total de nodos en la lista: " + totalNodos);
        
        // Insertar después de un valor específico
        lista.insertarDespues(10, 15);
        System.out.println("Lista después de insertar 15 después de 10:");
        lista.displayForward();
        
        // Revertir la lista
        lista.revertir();
        System.out.println("Lista después de revertir:");
        lista.displayForward();
    }
}

