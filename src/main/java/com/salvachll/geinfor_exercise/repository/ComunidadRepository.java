package com.salvachll.geinfor_exercise.repository;

import com.salvachll.geinfor_exercise.entity.ComunidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("comunidadRepository")
public interface ComunidadRepository extends JpaRepository<ComunidadEntity, Serializable> {
}
