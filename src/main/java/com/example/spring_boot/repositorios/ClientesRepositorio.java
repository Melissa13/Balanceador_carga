package com.example.spring_boot.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring_boot.entidades.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClientesRepositorio extends JpaRepository<clientes,Long>{
    @Query("select u from clientes u where u.id = :id")
    clientes buscar(@Param("id") Long id);
}
