package com.example.RegistroProveedores1.Proveedor.Servicies;

import com.example.RegistroProveedores1.Proveedor.Proveedor;
import com.example.RegistroProveedores1.Proveedor.Repositoryes.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProveedorService {
    @Autowired
    private static ProveedorRepository proveedorRepository;

    @Autowired
    public void setProveedorRepository(ProveedorRepository proveedorRepository) {
        ProveedorService.proveedorRepository = proveedorRepository;
    }

    // Método estático para registrar un proveedor
    public static Proveedor registrarProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }



}
