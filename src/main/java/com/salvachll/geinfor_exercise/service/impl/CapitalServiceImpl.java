package com.salvachll.geinfor_exercise.service.impl;

import com.salvachll.geinfor_exercise.repository.CapitalRepository;
import com.salvachll.geinfor_exercise.service.CapitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("capitalService")
public class CapitalServiceImpl implements CapitalService {

    @Autowired
    @Qualifier("capitalRepository")
    CapitalRepository capitalRepository;
}
