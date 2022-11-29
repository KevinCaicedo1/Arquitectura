package com.example.empresas.renta.service;

import com.example.empresas.renta.model.TipoInstrumento;
import com.example.empresas.renta.model.TipoInstrumentoPK;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TipoInstrumentoService {
    List<TipoInstrumento> findAll();
    TipoInstrumento findById(TipoInstrumentoPK id);
    TipoInstrumento save(TipoInstrumento tipoInstrumento);
    void deleteById(TipoInstrumentoPK id);
    List<TipoInstrumento> findByPkCodEmpresa(Integer codEmpresa);
    List<TipoInstrumento> findByPkCodTipoInstrumento(String codTipoInstrumento);
    
    
}
