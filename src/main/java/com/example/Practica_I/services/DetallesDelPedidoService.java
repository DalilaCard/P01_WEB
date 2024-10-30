package com.example.Practica_I.services;

import com.example.Practica_I.repositories.DetallesDelPedidoRepository;
import org.springframework.stereotype.Service;
import com.example.Practica_I.models.DetalleDelPedido;

import java.util.List;

@Service
public class DetallesDelPedidoService {
    DetallesDelPedidoRepository detallesDelPedidoRepository;

    public DetallesDelPedidoService(DetallesDelPedidoRepository detallesDelPedidoRepository) {
        this.detallesDelPedidoRepository = detallesDelPedidoRepository;
    }

    public List<DetalleDelPedido> getAllDetallesDelPedido() {
        return detallesDelPedidoRepository.obtenerDetallesDelPedidos();
    }

    public DetalleDelPedido getDetallesDelPedidoById(Long id) {
        return detallesDelPedidoRepository.obtenerDetalleDelPedidoById(id);
    }

    public DetalleDelPedido createDetalleDelPedido(DetalleDelPedido detalleDelPedido) {
        return detallesDelPedidoRepository.guardarDetalleDelPedido(detalleDelPedido);
    }

    public DetalleDelPedido updateDetalleDelPedido(DetalleDelPedido detalleDelPedido) {
        return detallesDelPedidoRepository.actualizarDetalleDelPedido(detalleDelPedido);
    }

    public void deleteDetalleDelPedido(Long id) {
        detallesDelPedidoRepository.eliminarDetalleDelPedido(id);
    }
}

