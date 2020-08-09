package com.proyecto.proyecto.Controladores;

import java.util.List;

import com.proyecto.proyecto.Controladores.util.PacienteRequest;
import com.proyecto.proyecto.Modelos.Paciente;
import com.proyecto.proyecto.Servicios.ServicioPaciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@CrossOrigin
public class PacienteControlador {

    @Autowired
    ServicioPaciente servicioP;

    @PostMapping(value="/DatosPaciente")
    public boolean Registro(@RequestBody PacienteRequest request) {
        Paciente p = new Paciente(request.getId(),request.getNombre(),request.getRut(),request.getEnfermedad(),request.getEstado());
        return servicioP.crear(p);
    }

    @GetMapping(value="/DatosPaciente")
    public List<Paciente> verTodosPacientes(){
        return servicioP.buscarTodos();
    }

    @PostMapping(value="/Datos1Paciente")
    public Paciente ver1Paciente(@RequestBody PacienteRequest request){
        return servicioP.buscar(request.getId());
    }

    @PostMapping(value="/DatosPacienteRut")
    public Paciente ver1PacienteRut(@RequestBody PacienteRequest request){
        return servicioP.buscarRut(request.getRut());
    }

    @DeleteMapping(value="/del1Paciente")
    public boolean del1Paciente(@RequestBody PacienteRequest request){
        return servicioP.delete(request.getId());
    }

    @PutMapping(value="/DatosPaciente")
    public boolean upd1Paciente(@RequestBody PacienteRequest request){
        return servicioP.update(request);
    }

    @PutMapping(value="/EstadoPaciente")
    public boolean upd1Paciente2(@RequestBody PacienteRequest request){
        return servicioP.updateEstado(request);
    }


}
