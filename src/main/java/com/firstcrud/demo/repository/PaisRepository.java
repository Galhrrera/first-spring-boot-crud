package com.firstcrud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.firstcrud.demo.model.Pais;

public interface PaisRepository extends JpaRepository<Pais, Long>{
    
}
