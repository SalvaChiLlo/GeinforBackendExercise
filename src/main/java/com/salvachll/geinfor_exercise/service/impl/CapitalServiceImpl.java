package com.salvachll.geinfor_exercise.service.impl;

import com.salvachll.geinfor_exercise.converter.CapitalConverter;
import com.salvachll.geinfor_exercise.entity.CapitalEntity;
import com.salvachll.geinfor_exercise.models.CapitalModel;
import com.salvachll.geinfor_exercise.repository.CapitalRepository;
import com.salvachll.geinfor_exercise.service.CapitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("capitalService")
public class CapitalServiceImpl implements CapitalService {

    @Autowired
    @Qualifier("capitalRepository")
    CapitalRepository capitalRepository;

    @Override
    public List<CapitalModel> index() {
        List<CapitalEntity> capitales = capitalRepository.findAll();
        return CapitalConverter.entitiesToModels(capitales);
    }

    @Override
    public CapitalModel show(int id) {
        return CapitalConverter.entityToModel(capitalRepository.getById(id));
    }

    @Override
    public int delete(int id) {
        capitalRepository.deleteById(id);
        return 0;
    }

    @Override
    public CapitalModel create(CapitalModel model) {
        CapitalEntity entity = capitalRepository.save(CapitalConverter.modelToEntity(model));
        return CapitalConverter.entityToModel(entity);
    }

    @Override
    public CapitalModel update(CapitalModel model) {
        CapitalEntity entity = capitalRepository.save(CapitalConverter.modelToEntity(model));
        return CapitalConverter.entityToModel(entity);
    }
}
