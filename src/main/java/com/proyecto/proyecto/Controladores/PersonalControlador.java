package com.proyecto.proyecto.Controladores;

import java.util.List;

import com.proyecto.proyecto.Controladores.util.PersonalRequest;
import com.proyecto.proyecto.Modelos.Personal;
import com.proyecto.proyecto.Servicios.ServicioPersonal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@CrossOrigin(origins = "*")
public class PersonalControlador {

    @Autowired
    ServicioPersonal servicioP;

    @PostMapping(value="/DatosPersonal")
    public boolean Registro(@RequestBody PersonalRequest request) {
        Personal p = new Personal(request.getId(),request.getNombre(),request.getTipo(),request.getEspecialidad(),request.getEstado());
        return servicioP.crear(p);
    }

    @GetMapping(value="/DatosPersonal")
    public List<Personal> verTodosPersonal(){
        return servicioP.buscarTodos();
    }

    @PostMapping(value="/Datos1Personal")
    public Personal ver1Personal(@RequestBody PersonalRequest request){
        return servicioP.buscar(request.getId());
    }


    @DeleteMapping(value="/del1Personal")
    public boolean del1Personal(@RequestBody PersonalRequest request){
        return servicioP.delete(request.getId());
    }

    @PutMapping(value="/DatosPersonal")
    public boolean upd1Personal(@RequestBody PersonalRequest request){
        return servicioP.update(request);
    }

    @PutMapping(value="/EstadoPersonal")
    public boolean updStatePersonal(@RequestBody PersonalRequest request){
        return servicioP.updateEstado(request);
    }


}
