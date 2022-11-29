package com.example.empresas.renta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.empresas.renta.model.CategoriaInstrumento;
import com.example.empresas.renta.repository.CategoriaInstrumentoRepository;


@RestController
@RequestMapping("/api/categoriaInstrumento")

public class CategoriaInstrumentoController {

    @Autowired
    private CategoriaInstrumentoRepository categoriaInstrumentoRepository;

    @GetMapping("/all")
    public List<CategoriaInstrumento> findAll() {
        return categoriaInstrumentoRepository.findAll();
    }

    @GetMapping("/codEmpresa/{codEmpresa}")
    public List<CategoriaInstrumento> findByPkCodEmpresa(Integer codEmpresa) {
        return categoriaInstrumentoRepository.findByPkCodEmpresa(codEmpresa);
    }

    @GetMapping("/codCategoriaInstrumento/{codCategoriaInstrumento}")
    public List<CategoriaInstrumento> findByPkCodCategoriaInstrumento(String codCategoriaInstrumento) {
        return categoriaInstrumentoRepository.findByPkCodCategoriaInstrumento(codCategoriaInstrumento);
    }

    
}

