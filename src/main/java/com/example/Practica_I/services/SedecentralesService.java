package com.example.Practica_I.services;

import com.example.Practica_I.models.Sedecentral;
import com.example.Practica_I.repositories.SedecentralesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SedecentralesService {
    SedecentralesRepository sedecentralesRepository;

    public SedecentralesService(SedecentralesRepository sedecentralesRepository) {
        this.sedecentralesRepository = sedecentralesRepository;
    }

    public List<Sedecentral> getAllSedecentrales() {
        return sedecentralesRepository.obtenerSedecentrales();
    }

    public Sedecentral getSedecentralById(Long id) {
        return sedecentralesRepository.obtenerSedecentralById(id);
    }

    public Sedecentral createSedecentral(Sedecentral sedecentral) {
        return sedecentralesRepository.guardarSedecentral(sedecentral);
    }

    public Sedecentral updateSedecentral(Sedecentral sedecentral) {
        return sedecentralesRepository.actualizarSedecentral(sedecentral);
    }

    public void eliminarSedecentral(Long id) {
        sedecentralesRepository.eliminarSedecentral(id);
    }

}
