package com.example.Practica_I.services;

import com.example.Practica_I.models.Rama;
import com.example.Practica_I.repositories.RamasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RamasService {
    RamasRepository ramasRepository;

    public RamasService(RamasRepository ramasRepository) {
        this.ramasRepository = ramasRepository;
    }

    public List<Rama> getAllRamas() {
        return ramasRepository.obtenerRamas();
    }

    public Rama getRamaById(Long id) {
        return ramasRepository.obtenerRamaById(id);
    }

    public Rama createRama(Rama rama) {
        return ramasRepository.guardarRama(rama);
    }

    public Rama updateRama(Rama rama) {
        return ramasRepository.actualizarRama(rama);
    }

    public void eliminarRama(Long id) {
        ramasRepository.eliminarRama(id);
    }

}
