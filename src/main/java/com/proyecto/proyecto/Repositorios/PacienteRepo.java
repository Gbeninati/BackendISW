package com.proyecto.proyecto.Repositorios;

import java.util.List;

import com.proyecto.proyecto.Modelos.Paciente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepo extends JpaRepository<Paciente,Long>{

    Paciente findById(long id);

    List<Paciente> findAll();

    Paciente findByRut(String rut);

}
