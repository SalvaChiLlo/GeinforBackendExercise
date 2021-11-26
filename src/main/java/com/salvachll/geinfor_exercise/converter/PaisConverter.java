package com.salvachll.geinfor_exercise.converter;

import com.salvachll.geinfor_exercise.entity.PaisEntity;
import com.salvachll.geinfor_exercise.models.PaisModel;

import java.util.ArrayList;
import java.util.List;

public class PaisConverter {
    private PaisConverter() {
    }

    public static PaisModel entityToModel(PaisEntity pais) {
        return new PaisModel(
                pais.getId(),
                pais.getNombre(),
                pais.getPoblacion(),
                pais.getCapital()
        );
    }

    public static PaisEntity modelToEntity(PaisModel pais) {
        return new PaisEntity(
                pais.getId(),
                pais.getNombre(),
                pais.getPoblacion(),
                pais.getCapital()
        );
    }

    public static List<PaisEntity> modelsToEntities(List<PaisModel> paises) {
        List<PaisEntity> res = new ArrayList<>();
        for (PaisModel pais : paises) {
            res.add(modelToEntity(pais));
        }
        return res;
    }

    public static List<PaisModel> entitiesToModels(List<PaisEntity> paises) {
        List<PaisModel> res = new ArrayList<>();
        for (PaisEntity pais : paises) {
            res.add(entityToModel(pais));
        }
        return res;
    }
}
