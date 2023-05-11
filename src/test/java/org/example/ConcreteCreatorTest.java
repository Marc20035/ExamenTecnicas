package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.example.Creator.ConcreteCreator;
import org.example.Productos.Product;
public class ConcreteCreatorTest {
    @Test
    public void testCreateProduct() {
        ConcreteCreator creator = new ConcreteCreator();
        Product productoA = creator.createProduct("elementoA", 1, 100.0f);
        Product productoB = creator.createProduct("elementoB", 2, 200.0f);
        Product kit = creator.createProduct("kit", 3, 0.0f);

        assertEquals(1, productoA.getCodigo());
        assertEquals(100.0f, productoA.getPrecio(), 0.01);

        assertEquals(2, productoB.getCodigo());
        assertEquals(200.0f, productoB.getPrecio(), 0.01);

        assertEquals(3, kit.getCodigo());
    }
}
