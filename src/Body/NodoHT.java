package Body;

/**
 *
 * @author adria
 */

public class NodoHT {

    public String key;
    public String val;
    public NodoHT next;
    public Nodo pointerArbol;

    public NodoHT(String key2, String val2, NodoHT siguiente2, Nodo pointerArbol2) {
        key = key2;
        val = val2;
        next = siguiente2;
        pointerArbol = pointerArbol2;
    }
}
