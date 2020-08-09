package com.proyecto.proyecto.Servicios;

import java.util.List;

import com.proyecto.proyecto.Controladores.util.PacienteRequest;
import com.proyecto.proyecto.Modelos.Paciente;
import com.proyecto.proyecto.Repositorios.PacienteRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPaciente {

    @Autowired
    PacienteRepo repositorio;


    public boolean crear(Paciente p){
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

    public Paciente buscar(long id){
        return repositorio.findById(id);
    }

    public List<Paciente> buscarTodos(){
        return repositorio.findAll();
    }

    public Paciente buscarRut(String rut){
        return repositorio.findByRut(rut);
    }

    public boolean update(PacienteRequest request){
        try {
            Paciente p = repositorio.findById(request.getId());
            p.setEnfermedad(request.getEnfermedad());
            p.setNombre(request.getNombre());
            p.setRut(request.getRut());
            p.setEstado(request.getEstado());
            repositorio.save(p);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean updateEstado(PacienteRequest request){
        try {
            Paciente p = repositorio.findById(request.getId());
            p.setEstado(request.getEstado());
            repositorio.save(p);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}
