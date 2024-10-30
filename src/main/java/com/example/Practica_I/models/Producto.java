package com.example.Practica_I.models;

public class Producto {
    private Long idProducto;
    private Long idProveedor;

    public Producto() {}

    public Producto(Long idProducto, Long idProveedor) {
        this.idProducto = idProducto;
        this.idProveedor = idProveedor;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }
    public Long getIdProveedor() {
        return idProveedor;
    }
    public void setIdProveedor(Long idProveedor) {
        this.idProveedor = idProveedor;
    }


}
