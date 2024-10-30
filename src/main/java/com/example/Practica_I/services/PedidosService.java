package com.example.Practica_I.services;

import com.example.Practica_I.models.Pedido;
import com.example.Practica_I.repositories.PedidosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PedidosService {

    PedidosRepository pedidosRepository;

    public PedidosService (PedidosRepository pedidosRepository) {
        this.pedidosRepository = pedidosRepository;
    }

    public List<Pedido> getAllPedidos(){
        return pedidosRepository.obtenerPedidos();
    }

    public Pedido getPedidosById(Long id){
        return pedidosRepository.obntenerPedidoById(id);
    }

    public Pedido createPedido(Pedido pedido){
        return pedidosRepository.guardarPedido(pedido);
    }

    public Pedido updatePedido(Pedido pedido){
        return pedidosRepository.actualizarPedido(pedido);
    }

    public void deletePedido(Long id){
        pedidosRepository.eliminarPedido(id);
    }



}
