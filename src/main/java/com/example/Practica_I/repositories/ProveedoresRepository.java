package com.example.Practica_I.repositories;

import com.example.Practica_I.models.Proveedor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ProveedoresRepository {
    private List<Proveedor> proveedores = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    public List<Proveedor> obtenerProveedores() {
        return proveedores;
    }

    public Proveedor obtenerProveedorById(long id) {
        return proveedores.stream().filter(proveedor -> proveedor.getIdProveedor().equals(id)).findFirst().orElse(null);
    }

    public Proveedor guardarProveedor(Proveedor proveedor) {
        proveedor.setIdProveedor(id.incrementAndGet());
        proveedores.add(proveedor);
        return proveedor;
    }

    public void eliminarProveedor(Long idProveedor) {
        proveedores.removeIf(proveedor -> proveedor.getIdProveedor().equals(idProveedor));
    }

    public Proveedor actualizarProveedor(Proveedor proveedor) {
        eliminarProveedor(proveedor.getIdProveedor());
        proveedores.add(proveedor);
        return proveedor;
    }


}
