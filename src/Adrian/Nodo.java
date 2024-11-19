package Adrian;


public class Nodo {
    private String element;
    private int key;
    private Nodo[] sons;
    private Nodo f;
    private Nodo m;

    public Nodo getF() {
        return f;
    }

    public void setF(Nodo f) {
        this.f = f;
    }

    public Nodo getM() {
        return m;
    }

    public void setM(Nodo m) {
        this.m = m;
    }
 

    public Nodo(String element, int key) {
        this.element = element;
        this.key = key;
        this.sons = new Nodo[0];
    }

    public Object getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Nodo[] getSons() {
        return sons;
    }

    public void setSons(Nodo[] sons) {
        this.sons = sons;
    }
    
    
    
    
}
