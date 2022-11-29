package com.example.empresas.renta.service;

import com.example.empresas.renta.model.Empresa;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface EmpresaService{
    List<Empresa> findAll();
    Empresa findById(Integer id);
    Empresa save(Empresa empresa);
    void deleteById(Integer id);
    List<Empresa> findByNombre(String nombre);
    List<Empresa> findByCodEmpresa(Integer codEmpresa);
    
}

