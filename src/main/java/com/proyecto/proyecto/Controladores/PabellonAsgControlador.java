package com.proyecto.proyecto.Controladores;

import java.util.List;

import com.proyecto.proyecto.Controladores.util.PabellonAsgRequest;
import com.proyecto.proyecto.Modelos.PabellonAsg;
import com.proyecto.proyecto.Servicios.ServicioPabellonAsg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@CrossOrigin
public class PabellonAsgControlador {

    @Autowired
    ServicioPabellonAsg servicioP;

    @PostMapping(value="/AsignarPabellon")
    public boolean Registro(@RequestBody PabellonAsgRequest request) {
        PabellonAsg p = new PabellonAsg(request.getId(),request.getPabellon(),request.getPersonal());
        return servicioP.crear(p);
    }


    @GetMapping(value="/GetPersonal")
    public List<PabellonAsg> obtenerPersonal(){
        return servicioP.buscarTodos();
    }


    @DeleteMapping(value="/DelAsignacion")
    @Transactional
    public boolean delPabellonAsg(@RequestParam(name="pabellon", required=true) long pabellon){
        return servicioP.delete(pabellon);
    }



}
