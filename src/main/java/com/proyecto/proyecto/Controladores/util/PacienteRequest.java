package com.proyecto.proyecto.Controladores.util;


public class PacienteRequest {

    private long id;

    private String nombre;

    private String enfermedad;

    private String rut;

    private String estado;

    public PacienteRequest() {
    }

    public PacienteRequest(long id) {
        this.id = id;
    }

    public PacienteRequest(String rut) {
        this.rut = rut;
    }

    public PacienteRequest(long id,String rut, String nombre, String enfermedad, String estado) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.enfermedad = enfermedad;
        this.estado = estado;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getEnfermedad() {
        return this.enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getRut() {
        return this.rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado= estado;
    }

}
