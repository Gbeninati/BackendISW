package com.proyecto.proyecto.Servicios;

import java.util.List;

import com.proyecto.proyecto.Controladores.util.HistorialPacienteRequest;
import com.proyecto.proyecto.Modelos.HistorialPaciente;
import com.proyecto.proyecto.Repositorios.HistorialPacienteRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioHistorialPaciente {

    @Autowired
    HistorialPacienteRepo repositorio;


    public boolean crear(HistorialPaciente p){
        try {
            repositorio.save(p);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<HistorialPaciente> buscarTodos(){
        return repositorio.findAll();
    }

    public List<HistorialPaciente> buscarPaciente(long paciente){
        return repositorio.findByPaciente(paciente);
    }

}
