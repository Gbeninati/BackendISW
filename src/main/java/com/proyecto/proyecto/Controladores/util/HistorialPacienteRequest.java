package com.proyecto.proyecto.Controladores.util;

public class HistorialPacienteRequest {

    private long id;

    private long paciente;

    private long pabellon;

    private String hora;


    public HistorialPacienteRequest() {
    }

    public HistorialPacienteRequest(long id) {
        this.id = id;
    }


    public HistorialPacienteRequest(long id, long paciente, long pabellon,String hora) {
        this.id = id;
        this.paciente = paciente;
        this.pabellon = pabellon;
        this.hora = hora;
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

    public long getPabellon() {
        return this.pabellon;
    }

    public void setPabellon(long pabellon) {
        this.pabellon = pabellon;
    }

    public String getHora() {
        return this.hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
