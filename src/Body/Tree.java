package Body;

public class Tree {

    private Nodo root;
    private int keyCounter;

    public Tree() {
        this.root = null;
        this.keyCounter = 0;
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }

    public int getKeyCounter() {
        return keyCounter;
    }

    public void setKeyCounter(int keyCounter) {
        this.keyCounter = keyCounter;
    }

    public boolean isEmpty() {
        return getRoot() == null;
    }

    public Nodo insert(String element, Nodo pointer, Nodo padre, Nodo madre, String apodo, String eyescolor, String haircolor, String title, String wife, String notes, String fate) {
        Nodo nodo = new Nodo(element, getKeyCounter(),apodo, eyescolor, haircolor, title, wife, notes, fate);
        

        if (isEmpty()) {
            setRoot(nodo);
        } else {
            increaseSons(padre, nodo);
            if (madre != null) {
                increaseSons(madre, nodo);
            }
            nodo.setF(padre);
            nodo.setM(madre);
        }
        keyCounter++;
        return nodo;
    }

    public void increaseSons(Nodo father, Nodo nodo) {
        Nodo[] newSons = new Nodo[father.getSons().length + 1];
        for (int i = 0; i < father.getSons().length; i++) {
            newSons[i] = father.getSons()[i];
        }
        newSons[newSons.length - 1] = nodo;
        father.setSons(newSons);
    }

    public void print(Nodo root) {
        if (isEmpty()) {
            System.out.println("The tree is empty");
        } else {
            System.out.println("[" + root.getElement() + "]");
            for (int i = 0; i < root.getSons().length; i++) {
                print(root.getSons()[i]);
            }
        }
    }

    public HashTable saveHashTable(Nodo root, HashTable ht) {
        if (isEmpty()) {
            return ht;
        } else {
            for (Nodo son : root.getSons()) {
                ht.insertar((String) son.getElement(), son);
                ht = saveHashTable(son, ht);
            }
        }

        return ht;
    }

    public Nodo encontrarNodoPorValor(String valor, Nodo nodoActual) {
        if (nodoActual == null) {
            return null;
        }

        if (nodoActual.getElement().equals(valor)) {
            return nodoActual;
        }

        for (Nodo hijo : nodoActual.getSons()) {
            Nodo nodoEncontrado = encontrarNodoPorValor(valor, hijo);
            if (nodoEncontrado != null) {
                return nodoEncontrado;
            }
        }
        return null;
    }

    public void descendientes(Nodo node) {
        if (node == null) {
            return;
        }
        System.out.println("descendiente: " + node.getElement());

        for (Nodo son : node.getSons()) {
            descendientes(son);
        }
    }
        public Arbolvisual descendientesvisual(Nodo node, Arbolvisual arbolvisual) {
        if (node == null) {
            return arbolvisual;
        }
        System.out.println("descendiente: " + node.getElement());
        if (!arbolvisual.Nodoexiste((String) node.getElement())){
         arbolvisual.AgregarNodo((String)node.getElement());
         arbolvisual.insertarNodo((String) node.getElement());
        }
        //arbolvisual.AgregarNodo((String)node.getElement());

        for (Nodo son : node.getSons()) {
            arbolvisual = descendientesvisual(son, arbolvisual);
        }
        return arbolvisual;
    }
        
        public Arbolvisual crearconexiondescientes(Nodo node, Arbolvisual arbolvisual) {
        if (node == null) {
            return arbolvisual;
        }
        System.out.println("descendiente: " + node.getElement());
        
        //arbolvisual.AgregarNodo((String)node.getElement());

        for (Nodo son : node.getSons()) {
            if (!arbolvisual.Aristaexiste((String) node.getElement(),(String) son.getElement())){
         arbolvisual.AgregarArista((String)node.getElement(), (String) son.getElement());
         arbolvisual.insertarAristas((String) node.getElement(), (String) son.getElement());
        }
            arbolvisual = crearconexiondescientes(son, arbolvisual);
         
        }
        return arbolvisual;
    }

    public void ancestros(Nodo node) {
        if (node == null) {
            return;
        }

        System.out.println("ancestro: " + node.getElement());

        ancestros(node.getF());
        ancestros(node.getM());
    }
}
