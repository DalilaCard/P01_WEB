package com.example.Practica_I.repositories;

import com.example.Practica_I.models.Entrega;
import com.example.Practica_I.models.Producto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ProductosRepository {
    private List<Producto> productos = new ArrayList<Producto>();
    private AtomicLong id = new AtomicLong();

    public List<Producto> obtenerProductos() {
        return productos;
    }

    public Producto obtenerProductoById(Long id) {
        return productos.stream().filter(producto -> producto.getIdProducto().equals(id)).findFirst().orElse(null);
    }

    public Producto guardarProducto(Producto producto) {
        producto.setIdProducto(id.incrementAndGet());
        productos.add(producto);
        return producto;
    }

    public void eliminarProducto(Long idProducto) {
        productos.removeIf(producto -> producto.getIdProducto().equals(idProducto));
    }

    public Producto actualizarProducto(Producto producto) {
        eliminarProducto(producto.getIdProducto());
        productos.add(producto);
        return producto;
    }
}
