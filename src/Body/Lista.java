/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Body;

/**
 *
 * @Alessandro Gramcko
 * @Adrian Vegas
 * @Jose Saggiomo
 */

class Lista {

    public NodoHT head;
    public String index;

    public Lista() {
        head = null;
        index = "";
    }

    public Lista(boolean nueva_sucursal, String new_index) {
        head = null;
        index = new_index;

    }

    public NodoHT crear(String key, Nodo pointerArbol) {
        NodoHT nodo = new NodoHT(key, key, null, pointerArbol);
        return nodo;
    }

    public NodoHT insertar(String key, Nodo pointerArbol) {
        NodoHT nodo = crear(key, pointerArbol);
        if (head == null) {
            head = nodo;
        } else {
            NodoHT pointer = head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = nodo;
        }
        return nodo;
    }

}
