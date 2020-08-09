package com.proyecto.proyecto.Controladores.util;


public class PersonalRequest {

    private long id;

    private String nombre;

    private String especialidad;

    private String tipo;

    private String estado;

    public PersonalRequest() {
    }

    public PersonalRequest(long id) {
        this.id = id;
    }

    public PersonalRequest(String tipo) {
        this.tipo = tipo;
    }

    public PersonalRequest(long id,String tipo, String nombre, String especialidad, String estado) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.especialidad = especialidad;
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


    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado= estado;
    }

}
