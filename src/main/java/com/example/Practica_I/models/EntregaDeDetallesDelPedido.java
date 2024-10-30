package com.example.Practica_I.models;

public class EntregaDeDetallesDelPedido {
    private Long idEntrega;
    private Long idPedido;
    private Long idDetalleDelPedido;

    public EntregaDeDetallesDelPedido() {}

    public EntregaDeDetallesDelPedido(Long idEntrega, Long idPedido, Long idDetallsDelPedido) {
        this.idEntrega = idEntrega;
        this.idPedido = idPedido;
        this.idDetalleDelPedido = idDetalleDelPedido;

    }

    public Long getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(Long idEntrega) {
        this.idEntrega = idEntrega;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Long getIdDetallesDelPedido() {
        return idDetalleDelPedido;
    }

    public void setIdDetallesDelPedido(Long idDetallesDelPedido) {
        this.idDetalleDelPedido = idDetallesDelPedido;
    }


}

