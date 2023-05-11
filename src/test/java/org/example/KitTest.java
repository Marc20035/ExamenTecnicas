package org.example;
import org.example.Productos.Elementos.ElementosConcretos.ConcreteElementoA;
import org.example.Productos.Elementos.ElementosConcretos.ConcreteElementoB;
import org.example.Productos.Elementos.Kit;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class KitTest {
    @Test
    public void testGetCodigo() {
        Kit kit = new Kit(3);
        assertEquals(3, kit.getCodigo());
    }

    @Test
    public void testGetPrecio() {
        Kit kit = new Kit(3);
        ConcreteElementoA elementoA = new ConcreteElementoA(1, 100.0f);
        ConcreteElementoB elementoB = new ConcreteElementoB(2, 200.0f);
        kit.addElemento(elementoA);
        kit.addElemento(elementoB);
        assertEquals(270.0f, kit.getPrecio(), 0.01);
    }

    @Test
    public void testAddElemento() {
        Kit kit = new Kit(3);
        ConcreteElementoA elementoA = new ConcreteElementoA(1, 100.0f);
        kit.addElemento(elementoA);
        assertEquals(90.0f, kit.getPrecio(), 0.01);
    }
}
