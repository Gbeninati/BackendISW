package com.proyecto.proyecto.Servicios;

import java.util.List;

import com.proyecto.proyecto.Controladores.util.PabellonRequest;
import com.proyecto.proyecto.Modelos.Pabellon;
import com.proyecto.proyecto.Repositorios.PabellonRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPabellon {

    @Autowired
    PabellonRepo repositorio;


    public boolean crear(Pabellon p){
        try {
            repositorio.save(p);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean delete(long id){

        try {
            repositorio.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Pabellon buscar(long id){
        return repositorio.findById(id);
    }

    public List<Pabellon> buscarTodos(){
        return repositorio.findAll();
    }

    public List<Pabellon> buscarEstado(String estado){
        return repositorio.findByEstado(estado);
    }

    public boolean update(PabellonRequest request){
        try {
            Pabellon p = repositorio.findById(request.getId());
            p.setPaciente(request.getPaciente());
            p.setEquipamiento(request.getEquipamiento());
            p.setHora(request.getHora());
            p.setEstado(request.getEstado());
            repositorio.save(p);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean asignar(PabellonRequest request){
        try {
            Pabellon p = repositorio.findById(request.getId());
            p.setPaciente(request.getPaciente());
            p.setHora(request.getHora());
            p.setEstado(request.getEstado());
            repositorio.save(p);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}
