package com.proyecto.proyecto.Controladores.util;

public class PabellonAsgRequest {

    private long id;

    private long pabellon;

    private long personal;

    public PabellonAsgRequest() {
    }

    public PabellonAsgRequest(long pabellon) {
        this.pabellon = pabellon;
    }

    public PabellonAsgRequest(long id, long pabellon, long personal) {
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
