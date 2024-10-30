package com.example.Practica_I.services;

import com.example.Practica_I.models.EntregaDeDetallesDelPedido;
import com.example.Practica_I.repositories.EntregasDeDetallesDelPedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EntregasDeDetallesDelPedidoService {
    EntregasDeDetallesDelPedidoRepository entregasDeDetallesDelPedidoRepository;

    public EntregasDeDetallesDelPedidoService(EntregasDeDetallesDelPedidoRepository entregasDeDetallesDelPedidoRepository) {
            this.entregasDeDetallesDelPedidoRepository = entregasDeDetallesDelPedidoRepository;
    }

    public List<EntregaDeDetallesDelPedido> getAllEntregasDeDetallesDelPedido() {
        return entregasDeDetallesDelPedidoRepository.obtenerEntregasDeDetallesDelPedidos();
    }

    public EntregaDeDetallesDelPedido getEntregaDeDetallesDelPedidoById(Long id) {
        return entregasDeDetallesDelPedidoRepository.obtenerEntregaDeDetallesDelPedidoById(id);
    }

    public EntregaDeDetallesDelPedido createEntregaDeDetallesDelPedido(EntregaDeDetallesDelPedido entregaDeDetallesDelPedido) {
        return entregasDeDetallesDelPedidoRepository.guardarEntregaDeDetallesDelPedido(entregaDeDetallesDelPedido);
    }

    public EntregaDeDetallesDelPedido updateEntregaDeDetallesDelPedido(EntregaDeDetallesDelPedido entregaDeDetallesDelPedido) {
        return entregasDeDetallesDelPedidoRepository.actualizarEntregaDeDetallesDelPedido(entregaDeDetallesDelPedido);
    }

    public void deleteEntregaDeDetallesDelPedido(Long id) {
        entregasDeDetallesDelPedidoRepository.eliminarEntregaDeDetallesDelPedido(id);
    }


}
