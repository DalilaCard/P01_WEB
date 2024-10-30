package com.example.Practica_I.controllers;

import com.example.Practica_I.models.Sedecentral;
import com.example.Practica_I.services.SedecentralesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Sedecentrales")
public class SedecentralesController {
    SedecentralesService sedecentralesService;

    public SedecentralesController(SedecentralesService sedecentralesService) {
        this.sedecentralesService = sedecentralesService;
    }

    @GetMapping
    public ResponseEntity<List<Sedecentral>> getSedecentrales() {
        return ResponseEntity.ok(sedecentralesService.getAllSedecentrales());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sedecentral> getSedecentral(@PathVariable Long id) {
        return ResponseEntity.ok(sedecentralesService.getSedecentralById(id));
    }

    @PostMapping
    public ResponseEntity<Sedecentral> addSedecentral(@RequestBody Sedecentral sedecentral) {
        return ResponseEntity.ok(sedecentralesService.createSedecentral(sedecentral));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sedecentral> updateSedecentral(@RequestBody Sedecentral sedecentral, @PathVariable Long id) {
        sedecentral.setIdSedecentral(id);
        return ResponseEntity.ok(sedecentralesService.updateSedecentral(sedecentral));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSedecentral(@PathVariable Long id) {
        sedecentralesService.eliminarSedecentral(id);
        return ResponseEntity.noContent().build();
    }

}
