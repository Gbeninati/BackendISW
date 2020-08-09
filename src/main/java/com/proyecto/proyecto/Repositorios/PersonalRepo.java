package com.proyecto.proyecto.Repositorios;

import java.util.List;

import com.proyecto.proyecto.Modelos.Personal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalRepo extends JpaRepository<Personal,Long>{

    Personal findById(long id);

    List<Personal> findAll();
}
