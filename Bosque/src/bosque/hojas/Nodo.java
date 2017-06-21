package bosque.hojas;

/**
 * This class contain the node of the tree.
 *
 * @author Raul Humberto Juliao
 */
public class Nodo {

    private String info; // save the name of the tree
    private String sdata;//save the string of the node
    private int ndata;// save the ID
    private Nodo izq;
    private Nodo der;
    

    public Nodo(String info) {
        
        this.info = info;
        this.ndata = 500;
        this.izq = null;
        this.der = null;
    }

    public Nodo(int ndata, String sdata) {
        this.ndata = ndata;
        this.sdata = sdata;
        this.izq = null;
        this.der = null;
    }


    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    public int getNdata() {
        return ndata;
    }

    public void setNdata(int ndata) {
        this.ndata = ndata;
    }

    public String getSdata() {
        return sdata;
    }

    public void setSdata(String sdata) {
        this.sdata = sdata;
    }
}
