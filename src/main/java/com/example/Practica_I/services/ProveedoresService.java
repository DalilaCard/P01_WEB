package com.example.Practica_I.services;

import com.example.Practica_I.models.Proveedor;
import com.example.Practica_I.repositories.ProveedoresRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedoresService {
    ProveedoresRepository proveedoresRepository;

    public ProveedoresService(ProveedoresRepository proveedoresRepository) {
        this.proveedoresRepository = proveedoresRepository;
    }

    public List<Proveedor> getAllProveedores() {
        return proveedoresRepository.obtenerProveedores();
    }

    public Proveedor getProveedorById(Long id) {
        return proveedoresRepository.obtenerProveedorById(id);
    }

    public Proveedor createProveedor(Proveedor proveedor) {
        return proveedoresRepository.guardarProveedor(proveedor);
    }

    public Proveedor updateProveedor(Proveedor proveedor) {
        return proveedoresRepository.actualizarProveedor(proveedor);
    }

    public void eliminarProveedor(Long id) {
        proveedoresRepository.eliminarProveedor(id);
    }

}
