package com.salvachll.geinfor_exercise.service.impl;

import com.salvachll.geinfor_exercise.converter.ComunidadConverter;
import com.salvachll.geinfor_exercise.entity.ComunidadEntity;
import com.salvachll.geinfor_exercise.models.ComunidadModel;
import com.salvachll.geinfor_exercise.repository.ComunidadRepository;
import com.salvachll.geinfor_exercise.service.ComunidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("comunidadService")
public class ComunidadServiceImpl implements ComunidadService {

    @Autowired
    @Qualifier("comunidadRepository")
    ComunidadRepository comunidadRepository;

    @Override
    public List<ComunidadModel> index() {
        List<ComunidadEntity> comunidades = comunidadRepository.findAll();
        return ComunidadConverter.entitiesToModels(comunidades);
    }

    @Override
    public ComunidadModel show(int id) {
        return ComunidadConverter.entityToModel(comunidadRepository.getById(id));
    }

    @Override
    public int delete(int id) {
        comunidadRepository.deleteById(id);
        return 0;
    }

    @Override
    public ComunidadModel create(ComunidadModel model) {
        ComunidadEntity entity = comunidadRepository.save(ComunidadConverter.modelToEntity(model));
        return ComunidadConverter.entityToModel(entity);
    }

    @Override
    public ComunidadModel update(ComunidadModel model) {
        ComunidadEntity entity = comunidadRepository.save(ComunidadConverter.modelToEntity(model));
        return ComunidadConverter.entityToModel(entity);
    }
}
