package com.firstcrud.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.firstcrud.demo.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long>{
    
}
