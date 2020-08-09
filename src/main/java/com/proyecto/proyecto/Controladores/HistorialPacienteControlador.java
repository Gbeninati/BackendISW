package com.proyecto.proyecto.Controladores;

import java.util.List;

import com.proyecto.proyecto.Controladores.util.HistorialPacienteRequest;
import com.proyecto.proyecto.Modelos.HistorialPaciente;
import com.proyecto.proyecto.Servicios.ServicioHistorialPaciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin
public class HistorialPacienteControlador {

    @Autowired
    ServicioHistorialPaciente servicioP;

    @PostMapping(value="/DatosHistorial")
    public boolean Registro(@RequestBody HistorialPacienteRequest request) {
        HistorialPaciente p = new HistorialPaciente(request.getId(),request.getPaciente(),request.getPabellon(),request.getHora());
        return servicioP.crear(p);
    }

    @GetMapping(value="/DispHistorial")
    public List<HistorialPaciente> verTodosHistorial(){
        return servicioP.buscarTodos();
    }

    @GetMapping(value="/HistorialPaciente")
    public List<HistorialPaciente> historialbypaciente(@RequestParam(name="paciente", required=true) long paciente){
        return servicioP.buscarPaciente(paciente);
    }

}
