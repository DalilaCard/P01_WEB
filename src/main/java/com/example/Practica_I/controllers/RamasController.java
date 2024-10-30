package com.example.Practica_I.controllers;

import com.example.Practica_I.models.Rama;
import com.example.Practica_I.services.RamasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ramas")
public class RamasController {
    RamasService ramasService;

    public RamasController(RamasService ramasService) {
        this.ramasService = ramasService;
    }

    @GetMapping
    public ResponseEntity<List<Rama>> getRamas() {
        return ResponseEntity.ok(ramasService.getAllRamas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rama> getRama(@PathVariable Long id) {
        return ResponseEntity.ok(ramasService.getRamaById(id));
    }

    @PostMapping
    public ResponseEntity<Rama> addRama(@RequestBody Rama rama) {
        return ResponseEntity.ok(ramasService.createRama(rama));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Rama> updateRama(@RequestBody Rama rama, @PathVariable Long id) {
        rama.setIdRama(id);
        return ResponseEntity.ok(ramasService.updateRama(rama));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRama(@PathVariable Long id) {
        ramasService.eliminarRama(id);
        return ResponseEntity.noContent().build();
    }

}
