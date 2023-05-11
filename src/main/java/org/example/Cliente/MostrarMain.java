package org.example.Cliente;

import org.example.Creator.ConcreteCreator;
import org.example.Productos.Elementos.Kit;
import org.example.Productos.Product;

public class MostrarMain {
    public void Mostrarmain() {
        ConcreteCreator creator = new ConcreteCreator();

        Product elementoA = creator.createProduct("elementoA", 1, 100.0f);
        Product elementoB = creator.createProduct("elementoB", 2, 200.0f);

        Kit kit = (Kit) creator.createProduct("kit", 3, 0.0f);

        kit.addElemento(elementoA);
        kit.addElemento(elementoB);

        System.out.println("Elemento A - Codigo: " + elementoA.getCodigo() + ", Precio: " + elementoA.getPrecio());
        System.out.println("Elemento B - Codigo: " + elementoB.getCodigo() + ", Precio: " + elementoB.getPrecio());
        System.out.println("Kit - Codigo: " + kit.getCodigo() + ", Precio: " + kit.getPrecio());

        Kit kitGrande = (Kit) creator.createProduct("kit", 4, 0.0f);

        Product elementoC = creator.createProduct("elementoA", 5, 300.0f);
        kitGrande.addElemento(elementoC);
        kitGrande.addElemento(kit);

        System.out.println("Kit Grande - Codigo: " + kitGrande.getCodigo() + ", Precio: " + kitGrande.getPrecio());
    }

    public static void aux() {
        MostrarMain main = new MostrarMain();
        main.Mostrarmain();
    }
}