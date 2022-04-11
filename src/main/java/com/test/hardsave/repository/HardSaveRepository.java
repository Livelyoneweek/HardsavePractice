package com.test.hardsave.repository;

import com.test.hardsave.domain.HardSave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HardSaveRepository extends JpaRepository<HardSave, Long> {

}
