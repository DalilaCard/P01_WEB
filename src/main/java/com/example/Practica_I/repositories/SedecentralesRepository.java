package com.example.Practica_I.repositories;

import org.springframework.stereotype.Repository;
import com.example.Practica_I.models.Sedecentral;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class SedecentralesRepository {

    private List<Sedecentral> sedecentrales = new ArrayList<Sedecentral>();
    private AtomicLong id = new AtomicLong();

    public List<Sedecentral> obtenerSedecentrales() {
        return sedecentrales;
    }

    public Sedecentral obtenerSedecentralById(long id) {
        return sedecentrales.stream().filter(sedecentral -> sedecentral.getIdSedecentral().equals(id)).findFirst().orElse(null);
    }

    public Sedecentral guardarSedecentral(Sedecentral sedecentral) {
        sedecentral.setIdSedecentral(id.getAndIncrement());
        sedecentrales.add(sedecentral);
        return sedecentral;
    }

    public void eliminarSedecentral(Long idSedecentral) {
        sedecentrales.removeIf(sedecentral -> sedecentral.getIdSedecentral().equals(idSedecentral));
    }

    public Sedecentral actualizarSedecentral(Sedecentral sedecentral) {
        eliminarSedecentral(sedecentral.getIdSedecentral());
        sedecentrales.add(sedecentral);
        return sedecentral;
    }
}
