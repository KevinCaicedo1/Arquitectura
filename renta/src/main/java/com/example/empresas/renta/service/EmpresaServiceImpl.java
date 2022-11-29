package com.example.empresas.renta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.empresas.renta.model.Empresa;
import com.example.empresas.renta.repository.EmpresaRepository;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    @Override
    public Empresa findById(Integer id) {
        return empresaRepository.findById(id).orElse(null);
    }

    @Override
    public Empresa save(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    @Override
    public void deleteById(Integer id) {
        empresaRepository.deleteById(id);
    }

    @Override
    public List<Empresa> findByNombre(String nombre) {
        return empresaRepository.findByNombre(nombre);
    }

    @Override
    public List<Empresa> findByCodEmpresa(Integer codEmpresa) {
        return empresaRepository.findByCodEmpresa(codEmpresa);
    }

}


