package com.salvachll.geinfor_exercise.service.impl;

import com.salvachll.geinfor_exercise.repository.PaisRepository;
import com.salvachll.geinfor_exercise.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("paisService")
public class PaisServiceImpl implements PaisService {

    @Autowired
    @Qualifier("paisRepository")
    PaisRepository paisRepository;
}
