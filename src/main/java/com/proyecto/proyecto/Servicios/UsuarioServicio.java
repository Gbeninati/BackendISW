package com.proyecto.proyecto.Servicios;

import java.util.List;

import com.proyecto.proyecto.Modelos.Usuario;
import com.proyecto.proyecto.Repositorios.UsuarioRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("serviciousuario")
public class UsuarioServicio {
    @Autowired
    @Qualifier("repositoriousuario")
    private UsuarioRepositorio repositorio;

    public long crear(Usuario user){
        try{
            repositorio.save(user);
            return user.getId();
        } catch (Exception e) {
            return -1;
        }
    }

    public boolean eliminar(long id){
        try{
            repositorio.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Usuario> obtenerAll(){
        return repositorio.findAll();
    }
}
