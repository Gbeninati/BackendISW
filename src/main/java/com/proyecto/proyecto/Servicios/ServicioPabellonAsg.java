package com.proyecto.proyecto.Servicios;

import java.util.List;

import com.proyecto.proyecto.Controladores.util.PabellonAsgRequest;
import com.proyecto.proyecto.Modelos.PabellonAsg;
import com.proyecto.proyecto.Repositorios.PabellonAsgRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPabellonAsg {

    @Autowired
    PabellonAsgRepo repositorio;


    public boolean crear(PabellonAsg p){
        try {
            repositorio.save(p);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean delete(long pabellon){

        try {
            repositorio.deleteByPabellon(pabellon);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<PabellonAsg> buscar(long id){
        return repositorio.findByPabellon(id);
    }

    public List<PabellonAsg> buscarTodos(){
        return repositorio.findAll();
    }


}
