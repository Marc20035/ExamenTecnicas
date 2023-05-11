package org.example.Creator;

import org.example.Productos.Product;

public interface Creator {
    Product createProduct(String type, int codigo, float precio);
}
