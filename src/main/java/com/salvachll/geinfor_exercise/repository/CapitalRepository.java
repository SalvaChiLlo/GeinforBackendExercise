package com.salvachll.geinfor_exercise.repository;

import com.salvachll.geinfor_exercise.entity.CapitalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("capitalRepository")
public interface CapitalRepository extends JpaRepository<CapitalEntity, Serializable> {
}
