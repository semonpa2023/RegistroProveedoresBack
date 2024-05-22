package com.example.RegistroProveedores1.Proveedor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int idTipoPersona;
    private int idRutNit;
    private String razonSocial;
    private String nombreRepresentanteLegal;
    private String telefono;
    private String email;
    private String direccion;
    private String nitRut;
    private String rutaDocumentoRut;
    private int idPais;
    private int idDepartamento;
    private int idMunicipio;

    public Proveedor() {

    }

    public Proveedor(int id, int idTipoPersona, int idRutNit, String razonSocial, String nombreRepresentanteLegal, String telefono, String email, String direccion, String nitRut, String rutaDocumentoRut,
                     int idPais, int idDepartamento, int idMunicipio) {
        this.id = id;
        this.idTipoPersona = idTipoPersona;
        this.idRutNit = idRutNit;
        this.razonSocial = razonSocial;
        this.nombreRepresentanteLegal = nombreRepresentanteLegal;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.nitRut = nitRut;
        this.rutaDocumentoRut = rutaDocumentoRut;
        this.idPais = idPais;
        this.idDepartamento = idDepartamento;
        this.idMunicipio = idMunicipio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTipoPersona() {
        return idTipoPersona;
    }

    public void setIdTipoPersona(int idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }

    public int getIdRutNit() {
        return idRutNit;
    }

    public void setIdRutNit(int idRutNit) {
        this.idRutNit = idRutNit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreRepresentanteLegal() {
        return nombreRepresentanteLegal;
    }

    public void setNombreRepresentanteLegal(String nombreRepresentanteLegal) {
        this.nombreRepresentanteLegal = nombreRepresentanteLegal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNitRut() {
        return nitRut;
    }

    public void setNitRut(String nitRut) {
        this.nitRut = nitRut;
    }

    public String getRutaDocumentoRut() {
        return rutaDocumentoRut;
    }

    public void setRutaDocumentoRut(String rutaDocumentoRut) {
        this.rutaDocumentoRut = rutaDocumentoRut;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }
}
