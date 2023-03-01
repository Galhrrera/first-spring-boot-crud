package com.firstcrud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.firstcrud.demo.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
}
