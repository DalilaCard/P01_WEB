package com.example.Practica_I.models;

import java.time.LocalDate;

public class Entrega {
    private Long idEntrega;
    private LocalDate fechaEntrega;
    private Long idProveedor;

    public Entrega() {}

    public Entrega(Long idEntrega, LocalDate fechaEntrega, Long idProveedor) {
        this.idEntrega = idEntrega;
        this.fechaEntrega = fechaEntrega;
        this.idProveedor = idProveedor;
    }

    public Long getId() {
        return idEntrega;
    }

    public void setId(Long id) {
        this.idEntrega = id;
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
