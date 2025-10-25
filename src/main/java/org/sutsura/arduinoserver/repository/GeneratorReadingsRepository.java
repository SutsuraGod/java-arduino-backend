package org.sutsura.arduinoserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.sutsura.arduinoserver.model.entity.GenerationReadings;

@Repository
public interface GeneratorReadingsRepository extends JpaRepository<GenerationReadings, Long> {
}
