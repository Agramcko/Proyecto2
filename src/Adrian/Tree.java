package Adrian;

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
    
    public Nodo insert(String element, Nodo pointer, Nodo padre, Nodo madre) { 
        Nodo nodo = new Nodo(element, getKeyCounter());
                
        if (isEmpty()) {
            setRoot(nodo);
        } 
        else {
            increaseSons(padre, nodo);
            if(madre!= null)increaseSons(madre, nodo);
            nodo.setF(padre);
            nodo.setM(madre);
        }
        keyCounter++;
        return nodo;
    }
    
    public void increaseSons(Nodo father, Nodo nodo){
        Nodo[] newSons = new Nodo[father.getSons().length + 1];
        for (int i = 0; i < father.getSons().length; i++) {
            newSons[i] = father.getSons()[i];
        }
        newSons[newSons.length - 1]= nodo;
        father.setSons(newSons);
    }
    
    public void print(Nodo root) {
        if (isEmpty()) {
            System.out.println("The tree is empty");
        } else {
            System.out.println("["+root.getElement()+"]");
            for (int i = 0; i < root.getSons().length; i++) {
                print(root.getSons()[i]);
            }
        }
    }
    
    public HashTable saveHashTable(Nodo root, HashTable ht) {
        if (isEmpty()) {
            return ht;        
        } 
        else {
            for (Nodo son : root.getSons()) {
                ht.insert((String) son.getElement(), son);
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
        
        for (Nodo son : node.getSons()) descendientes(son);
    }
     
        public void ancestros(Nodo node) {
            if (node == null){
                return;
            }  

            System.out.println("ancestro: " + node.getElement());

            ancestros(node.getF());
            ancestros(node.getM());
        }
}
