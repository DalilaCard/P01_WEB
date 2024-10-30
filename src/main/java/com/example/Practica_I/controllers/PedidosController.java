package com.example.Practica_I.controllers;

import com.example.Practica_I.models.Pedido;
import com.example.Practica_I.services.PedidosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pedidos")

public class PedidosController {

    PedidosService pedidosService;

    public PedidosController(PedidosService pedidosService) {
        this.pedidosService = pedidosService;
    }

    @GetMapping
    public ResponseEntity <List<Pedido>> getPedidos(){
        return ResponseEntity.ok(pedidosService.getAllPedidos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> getPedidos(@PathVariable Long id){
        return ResponseEntity.ok(pedidosService.getPedidosById(id));
    }

    @PostMapping
    public ResponseEntity<Pedido> addCategoria(@RequestBody Pedido pedido){
        return ResponseEntity.ok(pedidosService.createPedido(pedido));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pedido> updateCategoria(@RequestBody Pedido pedido, @PathVariable Long id){
        pedido.setIdPedido(id);
        return ResponseEntity.ok(pedidosService.updatePedido(pedido));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePedido(@PathVariable Long id){
        pedidosService.deletePedido(id);
        return ResponseEntity.noContent().build();
    }
}
