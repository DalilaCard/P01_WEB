package com.example.Practica_I.controllers;

import com.example.Practica_I.models.DetalleDelPedido;
import com.example.Practica_I.services.DetallesDelPedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/detallesDelPedido")
public class DetallesDelPedidoController {
    DetallesDelPedidoService detallesDelPedidoService;

    public DetallesDelPedidoController(DetallesDelPedidoService detallesDelPedidoService) {
        this.detallesDelPedidoService = detallesDelPedidoService;
    }

    @GetMapping
    public ResponseEntity<List<DetalleDelPedido>> getDetallesDelPedido() {
        return ResponseEntity.ok(detallesDelPedidoService.getAllDetallesDelPedido());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalleDelPedido> getDetalleDelPedido(@PathVariable Long id) {
        return ResponseEntity.ok(detallesDelPedidoService.getDetallesDelPedidoById(id));
    }

    @PostMapping
    public ResponseEntity<DetalleDelPedido> addDetalleDelPedido(@RequestBody DetalleDelPedido detalleDelPedido) {
        return ResponseEntity.ok(detallesDelPedidoService.createDetalleDelPedido(detalleDelPedido));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetalleDelPedido> updateDetalleDelPedido(@RequestBody DetalleDelPedido detalleDelPedido, @PathVariable Long id) {
        detalleDelPedido.setIdDetalleDelPedido(id);
        return ResponseEntity.ok(detallesDelPedidoService.updateDetalleDelPedido(detalleDelPedido));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDetalleDelPedido(@PathVariable Long id) {
        detallesDelPedidoService.deleteDetalleDelPedido(id);
        return ResponseEntity.noContent().build();
    }

}
