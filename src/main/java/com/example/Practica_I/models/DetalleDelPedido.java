package com.example.Practica_I.models;

public class DetalleDelPedido {
    private Long idDetalleDelPedido;
    private Long idProducto;
    private Long idPedido;
    private int cantidad;

    public DetalleDelPedido(Long idDetalleDelPedido, Long idProducto, Long idPedido, int cantidad) {
        this.idDetalleDelPedido = idDetalleDelPedido;
        this.idProducto = idProducto;
        this.idPedido = idPedido;
        this.cantidad = cantidad;
    }

    public Long getIdDetalleDelPedido() {

        return idDetalleDelPedido;
    }

    public void setIdDetalleDelPedido(Long idDetalleDelPedido) {
        this.idDetalleDelPedido = idDetalleDelPedido;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }



}
