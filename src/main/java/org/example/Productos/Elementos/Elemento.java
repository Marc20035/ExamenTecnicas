package org.example.Productos.Elementos;

import org.example.Productos.Product;

public abstract class Elemento implements Product {
    protected int codigo;
    protected float precio;

    public Elemento(int codigo, float precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public float getPrecio() {
        return this.precio;
    }
}
