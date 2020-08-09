package com.proyecto.proyecto.Repositorios;

import java.util.List;

import com.proyecto.proyecto.Modelos.Pabellon;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PabellonRepo extends JpaRepository<Pabellon,Long>{

    Pabellon findById(long id);

    List<Pabellon> findAll();

    List<Pabellon> findByEstado(String estado);

}
