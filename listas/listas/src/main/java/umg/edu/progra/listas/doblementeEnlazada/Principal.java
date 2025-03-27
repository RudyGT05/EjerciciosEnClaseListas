package umg.edu.progra.listas.doblementeEnlazada;

public class Principal {
    
    public static void main(String[] args) {
        // Crear una instancia de la lista doblemente enlazada
        DoblementeEnlazada lista = new DoblementeEnlazada();
        
        // Insertar elementos al final
        lista.insertarAlFinal(1);
        lista.insertarAlFinal(2);
        lista.insertarAlFinal(3);
        lista.insertarAlFinal(4);
        lista.insertarAlFinal(5);

        // Mostrar la lista de adelante hacia atrás
        System.out.println("Lista desde el principio:");
        lista.mostrarAdelante();
        
        // Mostrar la lista de atrás hacia adelante
        System.out.println("\nLista desde el final:");
        lista.mostrarAtras();

        // Insertar al inicio
        lista.insertarAlInicio(0);
        System.out.println("\nLista después de insertar 0 al inicio:");
        lista.mostrarAdelante();
        
        // Eliminar un elemento (3)
        lista.eliminar(3);
        System.out.println("\nLista después de eliminar el 3:");
        lista.mostrarAdelante();
        
        // Buscar un elemento (4)
        boolean encontrado = lista.buscar(4);
        System.out.println("\n¿Está el dato 4 en la lista?: " + encontrado);
        
        // Insertar un nuevo elemento después de un nodo (después del 4 insertar 6)
        lista.insertarDespues(4, 6);
        System.out.println("\nLista después de insertar 6 después de 4:");
        lista.mostrarAdelante();
        
        // Revertir la lista
        lista.revertir();
        System.out.println("\nLista después de revertir:");
        lista.mostrarAdelante();
    }
}
