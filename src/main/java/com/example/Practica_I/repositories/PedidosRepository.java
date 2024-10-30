package com.example.Practica_I.repositories;

import com.example.Practica_I.models.Pedido;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class PedidosRepository {
    private List<Pedido> pedidos = new ArrayList<Pedido>();
    private AtomicLong id = new AtomicLong();

    public List<Pedido> obtenerPedidos(){
        return pedidos;
    }

    public Pedido obntenerPedidoById(Long id){
        return pedidos.stream().filter(pedido -> pedido.getIdPedido().equals(id)).findFirst().orElse(null);
    }


    public Pedido guardarPedido(Pedido pedido){
        pedido.setIdPedido(id.incrementAndGet());
        pedidos.add(pedido);
        return pedido;
    }

    public void eliminarPedido(Long idPedido){
        pedidos.removeIf(pedido -> pedido.getIdPedido().equals(idPedido));
    }

    public Pedido actualizarPedido(Pedido pedido){
        eliminarPedido(pedido.getIdPedido());
        pedidos.add(pedido);
        return pedido;
    }



}
