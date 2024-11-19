package Body;

public class Main {

    public static void main(String[] args) {
        /*FUNCIONES PARA INSERTAR EN EL ARBOL*/
        Tree tree = new Tree();
        Nodo padre = null, madre= null;
        
        tree.insert("8", null, padre, madre);
        
        padre = tree.encontrarNodoPorValor("8",tree.getRoot());
        madre = null;

        tree.insert("10", tree.getRoot(), padre,madre);
        tree.insert("22", tree.getRoot(), padre,madre);
        tree.insert("5",  tree.getRoot(), padre,madre);
        tree.insert("80", tree.getRoot(), padre,madre);
        tree.insert("15", tree.getRoot(), padre,madre);
        
        padre = tree.encontrarNodoPorValor("22",tree.getRoot());
        madre = tree.encontrarNodoPorValor("5",tree.getRoot());

        tree.insert("1", tree.getRoot(),padre, madre);
        tree.insert("3", tree.getRoot(),padre, madre);
        tree.insert("7", tree.getRoot(),padre, madre);
        tree.insert("9", tree.getRoot(),padre, madre);

        padre = tree.encontrarNodoPorValor("1",tree.getRoot());
        madre = tree.encontrarNodoPorValor("3",tree.getRoot());
        
        tree.insert("99",  tree.getRoot(),padre, madre);

        /*FUNCIONES PARA INSERTAR EN EL HASH TABLE*/
        HashTable ht = new HashTable();
        ht = tree.saveHashTable(tree.getRoot(), ht);
        ht.insertar((String)tree.getRoot().getElement(), tree.getRoot());
        ht.mostrarHashTable();
        
        /*PUNTO 3.A*/
        String []usuariosEncontrados = ht.buscarPorNombre("22");
        for (String usuario : usuariosEncontrados) {
            System.out.println("Usuario encontrado: " + usuario);    
        }
        
        /*PUNTO 3.B*/
        NodoHT nodoPruebaPunt3B = ht.accederAlHashTable("5");
        tree.descendientes(nodoPruebaPunt3B.pointerArbol);
        
        /*PUNTO 4*/
        NodoHT nodoPruebaPunto4 = ht.accederAlHashTable("99");
        tree.ancestros(nodoPruebaPunto4.pointerArbol);
     }
}
