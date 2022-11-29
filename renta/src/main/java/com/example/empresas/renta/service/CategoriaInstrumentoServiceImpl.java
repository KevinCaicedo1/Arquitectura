package com.example.empresas.renta.service;

import com.example.empresas.renta.model.CategoriaInstrumento;
import com.example.empresas.renta.model.CategoriaInstrumentoPK;
import com.example.empresas.renta.repository.CategoriaInstrumentoRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaInstrumentoServiceImpl implements CategoriaInstrumentoService {

    private CategoriaInstrumentoRepository categoriaInstrumentoRepository;

    public CategoriaInstrumentoServiceImpl(CategoriaInstrumentoRepository categoriaInstrumentoRepository) {
        this.categoriaInstrumentoRepository = categoriaInstrumentoRepository;
    }

    @Override
    public List<CategoriaInstrumento> findAll() {
        return categoriaInstrumentoRepository.findAll();
    }

    @Override
    public CategoriaInstrumento findById(CategoriaInstrumentoPK id) {
        return categoriaInstrumentoRepository.findById(id).orElse(null);
    }

    @Override
    public CategoriaInstrumento save(CategoriaInstrumento categoriaInstrumento) {
        return categoriaInstrumentoRepository.save(categoriaInstrumento);
    }

    @Override
    public void deleteById(CategoriaInstrumentoPK id) {
        categoriaInstrumentoRepository.deleteById(id);
    }

    @Override
    public List<CategoriaInstrumento> findByPkCodEmpresa(Integer codEmpresa) {
        return categoriaInstrumentoRepository.findByPkCodEmpresa(codEmpresa);
    }

    @Override
    public List<CategoriaInstrumento> findByPkCodCategoriaInstrumento(String codCategoriaInstrumento) {
        return categoriaInstrumentoRepository.findByPkCodCategoriaInstrumento(codCategoriaInstrumento);
    }

}
    

