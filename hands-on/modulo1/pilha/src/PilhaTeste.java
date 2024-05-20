import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PilhaTeste {

    @Test
    public void pilhaVazia(){
        Pilha p = new Pilha();
        assertTrue(p.estaVazia());
        assertEquals(0, p.tamanhoPilha());

    }

    @Test
    public void empilhaUmElemento(){
        Pilha p = new Pilha();
        p.empilha("primeiro Elemento");
        assertFalse(p.estaVazia());
        assertEquals(1, p.tamanhoPilha());
        assertEquals("primeiro Elemento", p.topo());

    }

    @Test
    public void empilhaDesempilha(){
        Pilha p = new Pilha();
        p.empilha("primeiro elemento");
        p.empilha("segundo elemento");
        assertFalse(p.estaVazia());
        assertEquals(2, p.tamanhoPilha());
        assertEquals("segundo elemento", p.topo());
        Object desempilhado = p.desempilha();
        assertEquals(1, p.tamanhoPilha());
        assertEquals("primeiro elemento", p.topo());
        assertEquals("segundo elemento", desempilhado);
    }


}
