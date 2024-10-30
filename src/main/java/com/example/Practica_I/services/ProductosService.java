package com.example.Practica_I.services;

import com.example.Practica_I.models.Producto;
import com.example.Practica_I.repositories.ProductosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosService {
    ProductosRepository productosRepository;

    public ProductosService(ProductosRepository productosRepository) {
        this.productosRepository = productosRepository;
    }

    public List<Producto> getAllProductos() {
        return productosRepository.obtenerProductos();
    }

    public Producto getProductoById(Long id) {
        return productosRepository.obtenerProductoById(id);
    }

    public Producto createProducto(Producto producto) {
        return productosRepository.guardarProducto(producto);
    }

    public Producto updateProducto(Producto producto) {
        return productosRepository.actualizarProducto(producto);
    }

    public void eliminarProducto(Long id) {
        productosRepository.eliminarProducto(id);
    }
}
