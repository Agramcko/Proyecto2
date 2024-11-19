package Body;

public class Nodo {

    private String element;
    private int key;
    private Nodo[] sons;
    private Nodo f;
    private Nodo m;
    private String apodo;
    private String title;
    private String wife;
    private String eyescolor;
    private String haircolor;
    private String notes;
    private String fate;

    public Nodo getF() {
        return f;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public String getEyescolor() {
        return eyescolor;
    }

    public void setEyescolor(String eyescolor) {
        this.eyescolor = eyescolor;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getFate() {
        return fate;
    }

    public void setFate(String fate) {
        this.fate = fate;
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
