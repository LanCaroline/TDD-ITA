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
    public void empilhaElemento(){
        Pilha p = new Pilha();
        p.empilha("primeiro Elemento");
        assertFalse(p.estaVazia());
        assertEquals(1, p.tamanhoPilha());
        assertEquals("primeiro Elemento", p.topo());

    }


}
