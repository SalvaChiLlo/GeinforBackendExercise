package com.salvachll.geinfor_exercise.service.impl;

import com.salvachll.geinfor_exercise.repository.ComunidadRepository;
import com.salvachll.geinfor_exercise.service.ComunidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("comunidadService")
public class ComunidadServiceImpl implements ComunidadService {

    @Autowired
    @Qualifier("comunidadRepository")
    ComunidadRepository comunidadRepository;
}
