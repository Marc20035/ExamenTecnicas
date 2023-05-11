package org.example;
import org.example.Productos.Elementos.ElementosConcretos.ConcreteElementoB;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConcreteElementoBTest {
    @Test
    public void testGetCodigo() {
        ConcreteElementoB elementoB = new ConcreteElementoB(2, 200.0f);
        assertEquals(2, elementoB.getCodigo());
    }

    @Test
    public void testGetPrecio() {
        ConcreteElementoB elementoB = new ConcreteElementoB(2, 200.0f);
        assertEquals(200.0f, elementoB.getPrecio(), 0.01);
    }
}
