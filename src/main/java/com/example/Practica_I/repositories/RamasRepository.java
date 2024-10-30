package com.example.Practica_I.repositories;

import com.example.Practica_I.models.Rama;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class RamasRepository {
    private List<Rama> ramas = new ArrayList<Rama>();
    private AtomicLong id = new AtomicLong();

    public List<Rama> obtenerRamas() {
        return ramas;
    }

    public Rama obtenerRamaById(Long id) {
        return ramas.stream().filter(rama -> rama.getIdRama().equals(id)).findFirst().orElse(null);
    }

    public Rama guardarRama(Rama rama) {
        rama.setIdRama(id.incrementAndGet());
        ramas.add(rama);
        return rama;
    }

    public void eliminarRama(Long id) {
        ramas.removeIf(rama -> rama.getIdRama().equals(id));
    }

    public Rama actualizarRama(Rama rama) {
        eliminarRama(rama.getIdRama());
        ramas.add(rama);
        return guardarRama(rama);
    }
}
