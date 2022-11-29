package com.example.empresas.renta.service;

import com.example.empresas.renta.model.TipoInstrumento;
import com.example.empresas.renta.model.TipoInstrumentoPK;
import com.example.empresas.renta.repository.TipoInstrumentoRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoInstrumentoServiceImpl implements TipoInstrumentoService {

    private final TipoInstrumentoRepository tipoInstrumentoRepository;

    public TipoInstrumentoServiceImpl(TipoInstrumentoRepository tipoInstrumentoRepository) {
        this.tipoInstrumentoRepository = tipoInstrumentoRepository;
    }

    @Override
    public List<TipoInstrumento> findAll() {
        return tipoInstrumentoRepository.findAll();
    }

    @Override
    public TipoInstrumento findById(TipoInstrumentoPK id) {
        return tipoInstrumentoRepository.findById(id).orElse(null);
    }

    @Override
    public TipoInstrumento save(TipoInstrumento tipoInstrumento) {
        return tipoInstrumentoRepository.save(tipoInstrumento);
    }

    @Override
    public void deleteById(TipoInstrumentoPK id) {
        tipoInstrumentoRepository.deleteById(id);
    }

    @Override
    public List<TipoInstrumento> findByPkCodEmpresa(Integer codEmpresa) {
        return tipoInstrumentoRepository.findByPkCodEmpresa(codEmpresa);
    }

    @Override
    public List<TipoInstrumento> findByPkCodTipoInstrumento(String codTipoInstrumento) {
        return tipoInstrumentoRepository.findByPkCodTipoInstrumento(codTipoInstrumento);
    }

}