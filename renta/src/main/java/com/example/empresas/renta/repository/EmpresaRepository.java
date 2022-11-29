package com.example.empresas.renta.repository;
// repository package

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.empresas.renta.model.Empresa;



public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
    List<Empresa> findByNombre(String nombre);
    List<Empresa> findByCodEmpresa(Integer codEmpresa);
}
    

