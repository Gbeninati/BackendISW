package com.proyecto.proyecto.Repositorios;

import java.util.List;

import com.proyecto.proyecto.Modelos.HistorialPaciente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HistorialPacienteRepo extends JpaRepository<HistorialPaciente,Long>{

    List<HistorialPaciente> findByPaciente(long id);

    List<HistorialPaciente> findAll();

}
