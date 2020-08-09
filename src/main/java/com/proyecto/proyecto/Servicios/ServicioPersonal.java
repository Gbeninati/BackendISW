package com.proyecto.proyecto.Servicios;

import java.util.List;

import com.proyecto.proyecto.Controladores.util.PersonalRequest;
import com.proyecto.proyecto.Modelos.Personal;
import com.proyecto.proyecto.Repositorios.PersonalRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioPersonal {

    @Autowired
    PersonalRepo repositorio;


    public boolean crear(Personal p){
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

    public Personal buscar(long id){
        return repositorio.findById(id);
    }

    public List<Personal> buscarTodos(){
        return repositorio.findAll();
    }

    public boolean update(PersonalRequest request){
        try {
            Personal p = repositorio.findById(request.getId());
            p.setEspecialidad(request.getEspecialidad());
            p.setNombre(request.getNombre());
            p.setTipo(request.getTipo());
            p.setEstado(request.getEstado());
            repositorio.save(p);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public boolean updateEstado(PersonalRequest request){
        try {
            Personal p = repositorio.findById(request.getId());
            p.setEstado(request.getEstado());
            repositorio.save(p);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}
