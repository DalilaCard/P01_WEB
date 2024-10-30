package com.example.Practica_I.repositories;

import com.example.Practica_I.models.EntregaDeDetallesDelPedido;
import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class EntregasDeDetallesDelPedidoRepository {
    private List<EntregaDeDetallesDelPedido> entregasDeDetallesDelPedidos = new ArrayList<EntregaDeDetallesDelPedido>();
    private AtomicLong id = new AtomicLong();

    public List<EntregaDeDetallesDelPedido> obtenerEntregasDeDetallesDelPedidos() {
        return entregasDeDetallesDelPedidos;
    }

    public EntregaDeDetallesDelPedido obtenerEntregaDeDetallesDelPedidoById(Long id) {
        return entregasDeDetallesDelPedidos.stream().filter(entregaDeDetallesDelPedido -> entregaDeDetallesDelPedido.getIdDetallesDelPedido().equals(id)).findFirst().orElse(null);

    }

    public EntregaDeDetallesDelPedido guardarEntregaDeDetallesDelPedido(EntregaDeDetallesDelPedido entregaDeDetallesDelPedido) {
        entregaDeDetallesDelPedido.setIdDetallesDelPedido(id.getAndIncrement());
        entregasDeDetallesDelPedidos.add(entregaDeDetallesDelPedido);
        return entregaDeDetallesDelPedido;
    }

    public void eliminarEntregaDeDetallesDelPedido(Long id) {
        entregasDeDetallesDelPedidos.removeIf(entregaDeDetallesDelPedido -> entregaDeDetallesDelPedido.getIdDetallesDelPedido().equals(id));

    }

    public EntregaDeDetallesDelPedido actualizarEntregaDeDetallesDelPedido(EntregaDeDetallesDelPedido entregaDeDetallesDelPedido){
        eliminarEntregaDeDetallesDelPedido(entregaDeDetallesDelPedido.getIdDetallesDelPedido());
        entregasDeDetallesDelPedidos.add(entregaDeDetallesDelPedido);
        return entregaDeDetallesDelPedido;
    }







}
