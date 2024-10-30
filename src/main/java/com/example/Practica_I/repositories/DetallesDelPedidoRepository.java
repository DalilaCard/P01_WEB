package com.example.Practica_I.repositories;

import com.example.Practica_I.models.DetalleDelPedido;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class DetallesDelPedidoRepository {
    private List<DetalleDelPedido> detalleDelPedidos = new ArrayList<DetalleDelPedido>();
    private AtomicLong id = new AtomicLong();

    public List<DetalleDelPedido> obtenerDetallesDelPedidos() {
        return detalleDelPedidos;
    }

    public DetalleDelPedido obtenerDetalleDelPedidoById(Long id) {
        return detalleDelPedidos.stream().filter(detalleDelPedido -> detalleDelPedido.getIdDetalleDelPedido().equals(id)).findFirst().orElse(null);
    }

    public DetalleDelPedido guardarDetalleDelPedido(DetalleDelPedido detalleDelPedido) {
        detalleDelPedido.setIdDetalleDelPedido(id.getAndIncrement());
        detalleDelPedidos.add(detalleDelPedido);
        return detalleDelPedido;

    }

    public void eliminarDetalleDelPedido(Long detalleDelPedido) {
        detalleDelPedidos.removeIf(detalleDelPedido1 -> detalleDelPedido1.getIdDetalleDelPedido().equals(detalleDelPedido));

    }

    public DetalleDelPedido actualizarDetalleDelPedido(DetalleDelPedido detalleDelPedido) {
        eliminarDetalleDelPedido(detalleDelPedido.getIdDetalleDelPedido());
        detalleDelPedidos.add(detalleDelPedido);
        return detalleDelPedido;
    }

}
