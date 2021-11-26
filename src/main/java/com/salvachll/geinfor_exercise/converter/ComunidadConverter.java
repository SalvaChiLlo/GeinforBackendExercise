package com.salvachll.geinfor_exercise.converter;

import com.salvachll.geinfor_exercise.entity.ComunidadEntity;
import com.salvachll.geinfor_exercise.models.ComunidadModel;

import java.util.ArrayList;
import java.util.List;

public class ComunidadConverter {
    private ComunidadConverter() {
    }

    public static ComunidadModel entityToModel(ComunidadEntity comunidad) {
        return new ComunidadModel(
                comunidad.getId(),
                comunidad.getNombre(),
                comunidad.getPoblacion(),
                comunidad.getPais()
        );
    }

    public static ComunidadEntity modelToEntity(ComunidadModel comunidad) {
        return new ComunidadEntity(
                comunidad.getId(),
                comunidad.getNombre(),
                comunidad.getPoblacion(),
                comunidad.getPais()
        );
    }

    public static List<ComunidadEntity> modelsToEntities(List<ComunidadModel> comunidades) {
        List<ComunidadEntity> res = new ArrayList<>();
        for (ComunidadModel comunidad : comunidades) {
            res.add(modelToEntity(comunidad));
        }
        return res;
    }

    public static List<ComunidadModel> entitiesToModels(List<ComunidadEntity> comunidades) {
        List<ComunidadModel> res = new ArrayList<>();
        for (ComunidadEntity comunidad : comunidades) {
            res.add(entityToModel(comunidad));
        }
        return res;
    }
}
