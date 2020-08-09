package com.proyecto.proyecto.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="histoialpaciente")
public class HistorialPaciente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;

    @Column(name="id_paciente")
    private long paciente;

    @Column(name="id_pabellon")
    private long pabellon;

    @Column(name="hora_ingreso")
    private String hora;

    public HistorialPaciente() {
    }

    public HistorialPaciente(long id, long paciente, long pabellon,String hora) {
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
