package com.example.Practica_I.models;


import java.time.LocalDate;

public class Pedido {
    private Long idPedido;
    private LocalDate fechaPedido;
    private Long idSedeCentral;

    public Pedido() {}

    public Pedido(Long idPedido, LocalDate fechaPedido, Long IDSedeCentral) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.idSedeCentral = IDSedeCentral;

    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }
    public LocalDate getFechaPedido() {
        return fechaPedido;
    }
    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Long getIDSedeCentral() {
        return idSedeCentral;
    }

    public void setIDSedeCentral(Long IDSedeCentral) {
        this.idSedeCentral = IDSedeCentral;

    }

}
