package com.example.empresas.renta.service;

import com.example.empresas.renta.model.CategoriaInstrumento;
import com.example.empresas.renta.model.CategoriaInstrumentoPK;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public interface CategoriaInstrumentoService {
    List<CategoriaInstrumento> findAll();
    CategoriaInstrumento findById(CategoriaInstrumentoPK id);
    CategoriaInstrumento save(CategoriaInstrumento categoriaInstrumento);
    void deleteById(CategoriaInstrumentoPK id);
    List<CategoriaInstrumento> findByPkCodEmpresa(Integer codEmpresa);
    List<CategoriaInstrumento> findByPkCodCategoriaInstrumento(String codCategoriaInstrumento);
    
    
}
