package com.proyecto.proyecto.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pabellon")
public class Pabellon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;

    @Column(name="id_paciente")
    private long paciente;

    @Column(name="equipamiento")
    private String equipamiento;

    @Column(name="hora_ingreso")
    private String hora;

    @Column(name="estado")
    private String estado;


    public Pabellon() {
    }

    public Pabellon(long id, long paciente, String equipamiento,String hora, String estado) {
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
