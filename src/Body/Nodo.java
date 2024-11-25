package Body;

/**
 *
 * @Alessandro Gramcko
 * @Adrian Vegas
 * @Jose Saggiomo
 */

public class Nodo {

    private String element;
    private int key;
    private Nodo[] sons;
    private Nodo f;
    private Nodo m;
    private String apodo;
    private String bornto;
    private String conocido;
    private String title;
    private String wife;
    private String eyescolor;
    private String haircolor;
    private String notes;
    private String fate;

    public String getBornto() {
        return bornto;
    }

    public void setBornto(String bornto) {
        this.bornto = bornto;
    }

    public String getConocido() {
        return conocido;
    }

    public void setConocido(String conocido) {
        this.conocido = conocido;
    }
    
    

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

    public Nodo(String element, int key, String apodo, String bornto, String conocido, String eyescolor, String haircolor, String title, String wife, String notes, String fate ) {
        this.element = element;
        this.key = key;
        this.sons = new Nodo[0];
        this.apodo = apodo;
        this.bornto = bornto;
        this.conocido = conocido;
        this.eyescolor = eyescolor;
        this.haircolor = haircolor;
        this.title = title;
        this.wife = wife;
        this.notes = notes;
        this.fate = fate;
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
