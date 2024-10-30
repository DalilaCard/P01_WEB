package com.example.Practica_I.models;

public class Sedecentral {
    private Long idSedecentral;
    private Long idRama;

    public Sedecentral() {}

    public Sedecentral(Long idSedecentral, Long idRama) {
        this.idSedecentral = idSedecentral;
        this.idRama = idRama;
    }

    public Long getIdSedecentral() {
        return idSedecentral;

    }

    public void setIdSedecentral(Long idSedecentral) {
        this.idSedecentral = idSedecentral;
    }

    public Long getIdRama() {
        return idRama;
    }

    public void setIdRama(Long idRama) {
        this.idRama = idRama;
    }


}
