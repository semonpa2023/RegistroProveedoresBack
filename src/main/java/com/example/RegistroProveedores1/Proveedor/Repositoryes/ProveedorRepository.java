package com.example.RegistroProveedores1.Proveedor.Repositoryes;

import com.example.RegistroProveedores1.Proveedor.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long > {

    Proveedor save(Proveedor proveedor);
}
