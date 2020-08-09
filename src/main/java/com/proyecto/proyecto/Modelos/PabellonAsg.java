package com.proyecto.proyecto.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pabellonasg")
public class PabellonAsg {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;

    @Column(name="id_pabellon")
    private long pabellon;

    @Column(name="id_personal")
    private long personal;


    public PabellonAsg() {
    }

    public PabellonAsg(long id, long pabellon, long personal) {
        this.id = id;
        this.pabellon = pabellon;
        this.personal= personal;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPabellon() {
        return this.pabellon;
    }

    public void setPabellon(long pabellon) {
        this.pabellon = pabellon;
    }

    public long getPersonal() {
        return this.personal;
    }

    public void setPersonal(long personal) {
        this.personal= personal;
    }
}
