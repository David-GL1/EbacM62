package com.ebac.m62.service;

import com.ebac.m62.dto.Moto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoRepository extends JpaRepository<Moto, Long> {
}