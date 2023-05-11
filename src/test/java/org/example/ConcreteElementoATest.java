package org.example;
import org.example.Productos.Elementos.ElementosConcretos.ConcreteElementoA;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ConcreteElementoATest {
    @Test
    public void testGetCodigo() {
        ConcreteElementoA elementoA = new ConcreteElementoA(1, 100.0f);
        assertEquals(1, elementoA.getCodigo());
    }

    @Test
    public void testGetPrecio() {
        ConcreteElementoA elementoA = new ConcreteElementoA(1, 100.0f);
        assertEquals(100.0f, elementoA.getPrecio(), 0.01);
    }
}
