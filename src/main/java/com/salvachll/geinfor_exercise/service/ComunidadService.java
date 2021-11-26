package com.salvachll.geinfor_exercise.service;

import com.salvachll.geinfor_exercise.models.ComunidadModel;

import java.util.List;

public interface ComunidadService {
    List<ComunidadModel> index();

    ComunidadModel show(int id);

    int delete(int id);

    ComunidadModel create(ComunidadModel model);

    ComunidadModel update(ComunidadModel model);
}
