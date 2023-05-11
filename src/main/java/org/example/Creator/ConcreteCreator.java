package org.example.Creator;

import org.example.Productos.Elementos.ElementosConcretos.ConcreteElementoA;
import org.example.Productos.Elementos.ElementosConcretos.ConcreteElementoB;
import org.example.Productos.Elementos.Kit;
import org.example.Productos.Product;

public class ConcreteCreator implements Creator {
    public Product createProduct(String type, int codigo, float precio) {
        switch (type) {
            case "elementoA":
                return new ConcreteElementoA(codigo, precio);
            case "elementoB":
                return new ConcreteElementoB(codigo, precio);
            case "kit":
                return new Kit(codigo);
            default:
                return null;
        }
    }
}