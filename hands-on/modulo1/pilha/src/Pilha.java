public class Pilha {

    private Object[] elementos = new Object[20];
    private int quantidade = 0;

    public Pilha(){}


    public boolean estaVazia() {
            return quantidade == 0;
    }

    public int tamanhoPilha() {
        return quantidade;
    }

    public void empilha(Object elemento) {
        this.elementos[quantidade] = elemento;
        quantidade++;
    }

    public Object topo() {
        return elementos[quantidade-1];
    }

    public Object desempilha() {
        Object topo = topo();
        quantidade--;
        return topo;
    }
}
