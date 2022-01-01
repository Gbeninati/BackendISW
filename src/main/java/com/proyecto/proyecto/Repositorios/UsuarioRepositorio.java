package com.proyecto.proyecto.Repositorios;


import java.util.List;

import com.proyecto.proyecto.Modelos.Usuario;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositoriousuario")
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
    
    public abstract Usuario findById(long id);

    public abstract List<Usuario> findAll();

    public abstract boolean deleteById(long id);

    //public abstract boolean saveOrUpdate(Usuario estudiante);
}
