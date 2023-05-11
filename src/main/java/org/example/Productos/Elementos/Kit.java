package org.example.Productos.Elementos;

import org.example.Productos.Product;

import java.util.ArrayList;

public class Kit implements Product {
    private int codigo;
    private ArrayList<Product> elementos;

    public Kit(int codigo) {
        this.codigo = codigo;
        this.elementos = new ArrayList<>();
    }

    public void addElemento(Product elemento) {
        this.elementos.add(elemento);
    }

    public float getPrecio() {
        float precioTotal = 0;
        for (Product elemento : this.elementos) {
            precioTotal += elemento.getPrecio();
        }
        return precioTotal * 0.9f;
    }

    public int getCodigo() {
        return this.codigo;
    }
}
