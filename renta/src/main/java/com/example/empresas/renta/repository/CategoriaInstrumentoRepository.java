package com.example.empresas.renta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.empresas.renta.model.CategoriaInstrumento;
import com.example.empresas.renta.model.CategoriaInstrumentoPK;



public interface CategoriaInstrumentoRepository extends JpaRepository<CategoriaInstrumento, CategoriaInstrumentoPK> {
    List<CategoriaInstrumento> findByPkCodEmpresa(Integer codEmpresa);
    List<CategoriaInstrumento> findByPkCodCategoriaInstrumento(String codCategoriaInstrumento);

    
}
