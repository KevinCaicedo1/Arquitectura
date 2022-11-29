package com.example.empresas.renta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.empresas.renta.model.TipoInstrumento;
import com.example.empresas.renta.model.TipoInstrumentoPK;

// TipoInstrumentoRepository.java


public interface TipoInstrumentoRepository extends JpaRepository<TipoInstrumento, TipoInstrumentoPK> {
    List<TipoInstrumento> findByPkCodEmpresa(Integer codEmpresa);
    List<TipoInstrumento> findByPkCodTipoInstrumento(String codTipoInstrumento);

    
}
    

