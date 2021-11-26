package com.salvachll.geinfor_exercise.repository;

import com.salvachll.geinfor_exercise.entity.PaisEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("paisRepository")
public interface PaisRepository extends JpaRepository<PaisEntity, Serializable> {
}
