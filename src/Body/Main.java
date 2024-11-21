package Body;



public class Main {

    public static void main(String[] args) {
        /*FUNCIONES PARA INSERTAR EN EL ARBOL*/
        Tree tree = new Tree();
        Nodo padre = null, madre = null;

        tree.insert("Jon Snow", null, padre, madre, "Rey en el NOrte", "Marrones", "Negro", "Lord de Invernalia", "Daenerys", "Verdadero heredero al trono de hierro", "murio a manos de sus compañeros");

        padre = tree.encontrarNodoPorValor("Jon Snow", tree.getRoot());
        madre = null;

        tree.insert("Carlos", tree.getRoot(), padre, madre, "Carlitos", "verdes","Marron", "Gordito", "Carla", "Guardian", "Loco");
        tree.insert("Luis", tree.getRoot(), padre, madre, "Luisen", "gris", "rubio", "Gordito", "Luisa", "Salvador", "Amante");
        tree.insert("Pedro", tree.getRoot(), padre, madre, "Pedrito", "negros", "castaño", "Gordito", "Pietra", "Angel", "Salvaje");


        padre = tree.encontrarNodoPorValor("Carlos", tree.getRoot());
        madre = tree.encontrarNodoPorValor("Pedro", tree.getRoot());

        tree.insert("Isabel", tree.getRoot(), padre, madre, "Isa", "azul", "rubia", "Gordita", "Miguel", "Celosa", "Toxica");
        

        /*FUNCIONES PARA INSERTAR EN EL HASH TABLE*/
        HashTable ht = new HashTable();
        ht = tree.saveHashTable(tree.getRoot(), ht);
        ht.insertar((String) tree.getRoot().getElement(), tree.getRoot());
        ht.mostrarHashTable();

        /*PUNTO 3.A*/
        String[] usuariosEncontrados = ht.buscarPorNombre("JOn Snow");
        for (String usuario : usuariosEncontrados) {
            System.out.println("Usuario encontrado: " + usuario);
        }

        /*PUNTO 3.B*/
        NodoHT nodoPruebaPunt3B = ht.accederAlHashTable("Jon Snow");
        tree.descendientes(nodoPruebaPunt3B.pointerArbol);

        /*PUNTO 4*/
        NodoHT nodoPruebaPunto4 = ht.accederAlHashTable("Isabel");
        tree.ancestros(nodoPruebaPunto4.pointerArbol);
        
        Arbolvisual arbolvisual = new Arbolvisual();
        arbolvisual = tree.descendientesvisual(nodoPruebaPunt3B.pointerArbol, arbolvisual);
        arbolvisual = tree.crearconexiondescientes(nodoPruebaPunt3B.pointerArbol, arbolvisual);

        System.setProperty("org.graphstream.ui", "swing");
        
        arbolvisual.display();
        
        
    }
}


