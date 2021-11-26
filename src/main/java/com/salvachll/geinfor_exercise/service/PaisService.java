package com.salvachll.geinfor_exercise.service;

import com.salvachll.geinfor_exercise.models.PaisModel;

import java.util.List;

public interface PaisService {
    List<PaisModel> index();

    PaisModel show(int id);

    int delete(int id);

    PaisModel create(PaisModel model);

    PaisModel update(PaisModel model);
}
