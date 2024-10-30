package com.example.Practica_I.models;

import java.time.LocalDate;

public class Proveedor {
    private Long idEntrega;
    private LocalDate fechaEntrega;
    private Long idProveedor;

    public Proveedor() {}

    public Proveedor(Long idEntrega, LocalDate fechaEntrega, Long idProveedor) {
        this.idEntrega = idEntrega;
        this.fechaEntrega = fechaEntrega;
        this.idProveedor = idProveedor;
    }

    public Long getIdEntrega() {
        return idEntrega;
    }
    public void setIdEntrega(Long idEntrega) {
        this.idEntrega = idEntrega;
    }
    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }
    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    public Long getIdProveedor() {
        return idProveedor;
    }
    public void setIdProveedor(Long idProveedor) {
        this.idProveedor = idProveedor;
    }

}
