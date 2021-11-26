package com.salvachll.geinfor_exercise.converter;

import com.salvachll.geinfor_exercise.entity.CapitalEntity;
import com.salvachll.geinfor_exercise.models.CapitalModel;

import java.util.ArrayList;
import java.util.List;

public class CapitalConverter {
    private CapitalConverter() {
    }

    public static CapitalModel entityToModel(CapitalEntity capital) {
        return new CapitalModel(
                capital.getId(),
                capital.getNombre()
        );
    }

    public static CapitalEntity modelToEntity(CapitalModel capital) {
        return new CapitalEntity(
                capital.getId(),
                capital.getNombre()
        );
    }

    public static List<CapitalEntity> modelsToEntities(List<CapitalModel> capitales) {
        List<CapitalEntity> res = new ArrayList<>();
        for (CapitalModel capital : capitales) {
            res.add(modelToEntity(capital));
        }
        return res;
    }

    public static List<CapitalModel> entitiesToModels(List<CapitalEntity> capitales) {
        List<CapitalModel> res = new ArrayList<>();
        for (CapitalEntity capital : capitales) {
            res.add(entityToModel(capital));
        }
        return res;
    }
}
