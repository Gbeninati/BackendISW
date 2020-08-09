package com.proyecto.proyecto.Controladores.util;

public class PabellonRequest {

    private long id;

    private long paciente;

    private String equipamiento;

    private String hora;

    private String estado;

    public PabellonRequest() {
    }

    public PabellonRequest(long id) {
        this.id = id;
    }

    public PabellonRequest(String estado) {
        this.estado = estado;
    }

    public PabellonRequest(long id, long paciente, String equipamiento,String hora, String estado) {
        this.id = id;
        this.paciente = paciente;
        this.equipamiento = equipamiento;
        this.hora = hora;
        this.estado = estado;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPaciente() {
        return this.paciente;
    }

    public void setPaciente(long paciente) {
        this.paciente = paciente;
    }

    public String getEquipamiento() {
        return this.equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    public String getHora() {
        return this.hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado= estado;
    }
}
