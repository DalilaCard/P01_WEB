package com.example.Practica_I.repositories;

import com.example.Practica_I.models.Entrega;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class EntregasRepository {
    private List<Entrega> entregas = new ArrayList<Entrega>();
    private AtomicLong id = new AtomicLong();

    public List<Entrega> obtenerEntregas() {
        return entregas;
    }

    public Entrega obtenerEntregaById(Long id) {
        return entregas.stream().filter(entrega -> entrega.getId() == id).findFirst().orElse(null);

    }

    public Entrega guardarEntrega(Entrega entrega) {
        entrega.setId(id.incrementAndGet());
        entregas.add(entrega);
        return entrega;
    }

    public void eliminarEntrega(Long id) {
        entregas.removeIf(entrega -> entrega.getId().equals(id));
    }

    public Entrega actualizarEntrega(Entrega entrega) {
        eliminarEntrega(entrega.getId());
        entregas.add(entrega);
        return entrega;
    }
}
