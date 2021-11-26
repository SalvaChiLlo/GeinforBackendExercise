package com.salvachll.geinfor_exercise.service.impl;

import com.salvachll.geinfor_exercise.converter.PaisConverter;
import com.salvachll.geinfor_exercise.entity.PaisEntity;
import com.salvachll.geinfor_exercise.models.PaisModel;
import com.salvachll.geinfor_exercise.repository.PaisRepository;
import com.salvachll.geinfor_exercise.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("paisService")
public class PaisServiceImpl implements PaisService {

    @Autowired
    @Qualifier("paisRepository")
    PaisRepository paisRepository;

    @Override
    public List<PaisModel> index() {
        List<PaisEntity> capitales = paisRepository.findAll();
        return PaisConverter.entitiesToModels(capitales);
    }

    @Override
    public PaisModel show(int id) {
        return PaisConverter.entityToModel(paisRepository.getById(id));
    }

    @Override
    public int delete(int id) {
        paisRepository.deleteById(id);
        return 0;
    }

    @Override
    public PaisModel create(PaisModel model) {
        PaisEntity entity = paisRepository.save(PaisConverter.modelToEntity(model));
        return PaisConverter.entityToModel(entity);
    }

    @Override
    public PaisModel update(PaisModel model) {
        PaisEntity entity = paisRepository.save(PaisConverter.modelToEntity(model));
        return PaisConverter.entityToModel(entity);
    }
}
