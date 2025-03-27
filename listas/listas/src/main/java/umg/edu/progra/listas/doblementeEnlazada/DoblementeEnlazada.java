package umg.edu.progra.listas.doblementeEnlazada;

public class DoblementeEnlazada {

    public Nodo head;  // Renombré 'cabeza' a 'head' para mantener la consistencia.
    private Nodo tail; // Renombré 'cola' a 'tail' para mantener la consistencia.

    public DoblementeEnlazada() {
        this.head = null;
        this.tail = null;
    }

    // Insertar un nodo al final
    public void insertAtEnd(int data) {
        Nodo newNode = new Nodo(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Insertar un nodo al principio
    public void insertAtBeginning(int data) {
        Nodo newNode = new Nodo(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Eliminar un nodo
    public boolean delete(int data) {
        Nodo current = head;
        while (current != null) {
            if (current.data == data) {
                if (current == head) {
                    head = current.next;
                    if (head != null) head.prev = null;
                } else if (current == tail) {
                    tail = current.prev;
                    if (tail != null) tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Buscar un nodo
    public boolean search(int data) {
        Nodo current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Mostrar la lista hacia adelante
    public void displayForward() {
        Nodo current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Mostrar la lista hacia atrás
    public void displayBackward() {
        Nodo current = tail;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    // Método 1: Contar el número de nodos en la lista
    public int contarNodos() {
        int contador = 0;
        Nodo actual = head;
        while (actual != null) {
            contador++;
            actual = actual.next;
        }
        return contador;
    }

    // Método 2: Insertar un nodo después de un valor específico
    public boolean insertarDespues(int objetivo, int dato) {
        Nodo actual = head;
        while (actual != null) {
            if (actual.data == objetivo) {
                Nodo nuevoNodo = new Nodo(dato);
                nuevoNodo.next = actual.next;
                nuevoNodo.prev = actual;
                if (actual.next != null) {
                    actual.next.prev = nuevoNodo;
                } else {
                    tail = nuevoNodo;
                }
                actual.next = nuevoNodo;
                return true;
            }
            actual = actual.next;
        }
        return false;
    }

    // Método 3: Revertir la lista doblemente enlazada
    public void revertir() {
        Nodo temporal = null;
        Nodo actual = head;
        while (actual != null) {
            temporal = actual.prev;
            actual.prev = actual.next;
            actual.next = temporal;
            actual = actual.prev;
        }
        if (temporal != null) {
            head = temporal.prev;
        }
    }
}

	
	// Método 1: Contar el número de nodos en la lista
	// Método 2: Insertar un nodo después de un valor específico
	// Método 3: Revertir la lista doblemente enlazada

