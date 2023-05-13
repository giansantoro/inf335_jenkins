package br.unicamp.ic.inf335.beans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoBeanTest {

    private ProdutoBean produto1;
    private ProdutoBean produto2;
    private ProdutoBean produto3;

    @BeforeEach
    void setUp() {
        produto1 = new ProdutoBean();
        produto1.setValor(10.0);

        produto2 = new ProdutoBean();
        produto2.setValor(20.0);

        produto3 = new ProdutoBean();
        produto3.setValor(10.0);
    }

    @Test
    void testCompareTo() {
        assertEquals(-1, produto1.compareTo(produto2));

        assertEquals(1, produto2.compareTo(produto1));

        assertEquals(0, produto1.compareTo(produto3));
    }
}