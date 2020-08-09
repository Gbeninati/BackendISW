package com.proyecto.proyecto.Repositorios;

import java.util.List;

import com.proyecto.proyecto.Modelos.PabellonAsg;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PabellonAsgRepo extends JpaRepository<PabellonAsg,Long>{

    List<PabellonAsg> findAll();

    List<PabellonAsg> findByPabellon(long id);

    long deleteByPabellon(long pabellon);

}
