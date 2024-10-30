package com.example.Practica_I.controllers;

import com.example.Practica_I.models.Producto;
import com.example.Practica_I.services.ProductosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/productos")

public class ProductosController {
    ProductosService productosService;

    public ProductosController(ProductosService productosService) {
        this.productosService = productosService;
    }

    @GetMapping
    public ResponseEntity<List<Producto>> getProductos() {
        return ResponseEntity.ok(productosService.getAllProductos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> getProducto(@PathVariable Long id) {
        return ResponseEntity.ok(productosService.getProductoById(id));
    }

    @PostMapping
    public ResponseEntity<Producto> addProducto(@RequestBody Producto producto) {
        return ResponseEntity.ok(productosService.createProducto(producto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> updateProducto(@RequestBody Producto producto, @PathVariable Long id) {
        producto.setIdProducto(id);
        return ResponseEntity.ok(productosService.updateProducto(producto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProducto(@PathVariable Long id) {
        productosService.eliminarProducto(id);
        return ResponseEntity.noContent().build();
    }
}
