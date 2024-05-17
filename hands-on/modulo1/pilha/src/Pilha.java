public class Pilha {

    private Object elemento;
    private int quantidade;

    public Pilha(){}


    public boolean estaVazia() {
        return elemento == null;
    }

    public int tamanhoPilha() {
        return quantidade;
    }

    public void empilha(Object elemento) {
        this.elemento = elemento;
        quantidade++;
    }

    public Object topo() {
        return elemento;
    }
}
