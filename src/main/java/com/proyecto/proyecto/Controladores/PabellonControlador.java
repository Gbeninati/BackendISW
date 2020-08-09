package com.proyecto.proyecto.Controladores;

import java.util.List;

import com.proyecto.proyecto.Controladores.util.PabellonRequest;
import com.proyecto.proyecto.Modelos.Pabellon;
import com.proyecto.proyecto.Servicios.ServicioPabellon;

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
public class PabellonControlador {

    @Autowired
    ServicioPabellon servicioP;

    @PostMapping(value="/DatosPabellon")
    public boolean Registro(@RequestBody PabellonRequest request) {
        Pabellon p = new Pabellon(request.getId(),request.getPaciente(),request.getEquipamiento(),request.getHora(),request.getEstado());
        return servicioP.crear(p);
    }

    @GetMapping(value="/DispPabellon")
    public List<Pabellon> verTodosPabellons(){
        return servicioP.buscarTodos();
    }

    @PostMapping(value="/Disp1Pabellon")
    public Pabellon ver1Pabellon(@RequestBody PabellonRequest request){
        return servicioP.buscar(request.getId());
    }

    @PostMapping(value="/DispPabellonEst")
    public List<Pabellon> verPabellonEst(@RequestBody PabellonRequest request){
        return servicioP.buscarEstado(request.getEstado());
    }

    @DeleteMapping(value="/del1Pabellon")
    public boolean del1Pabellon(@RequestBody PabellonRequest request){
        return servicioP.delete(request.getId());
    }

    @PutMapping(value="/DatosPabellon")
    public boolean upd1Pabellon(@RequestBody PabellonRequest request){
        return servicioP.update(request);
    }

    @PutMapping(value="/AsignacionPabellon")
    public boolean updPabellon(@RequestBody PabellonRequest request){
        return servicioP.asignar(request);
    }

    @PostMapping(value="/PabellonValido")
    public boolean validez(@RequestBody PabellonRequest request){
        Pabellon p = servicioP.buscar(request.getId());
        if(p == null){
          return false;
        }
        else{
          return true;
        }
    }


}
