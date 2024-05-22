package com.example.RegistroProveedores1.Proveedor.Controller;

import com.example.RegistroProveedores1.Proveedor.Proveedor;
import com.example.RegistroProveedores1.Proveedor.Servicies.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @PostMapping("/registrar")
    public Proveedor registrarProveedor(@RequestBody Proveedor proveedor) {
        return ProveedorService.registrarProveedor(proveedor);

    }
}
