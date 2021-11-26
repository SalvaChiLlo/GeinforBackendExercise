package com.salvachll.geinfor_exercise.service;

import com.salvachll.geinfor_exercise.models.CapitalModel;

import java.util.List;

public interface CapitalService {
    List<CapitalModel> index();

    CapitalModel show(int id);

    int delete(int id);

    CapitalModel create(CapitalModel model);

    CapitalModel update(CapitalModel model);
}
