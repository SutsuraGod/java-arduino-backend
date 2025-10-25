package org.sutsura.arduinoserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sutsura.arduinoserver.mapper.GenerationReadingsMapper;
import org.sutsura.arduinoserver.model.dto.GenerationReadingsDto;
import org.sutsura.arduinoserver.model.entity.GenerationReadings;
import org.sutsura.arduinoserver.repository.GeneratorReadingsRepository;

@Service
public class GeneratorReadingsService {

    @Autowired
    private GeneratorReadingsRepository generatorReadingsRepository;

    @Autowired
    private GenerationReadingsMapper generatorReadingsMapper;

    public void saveGeneratorReadings(GenerationReadingsDto dto) {
        GenerationReadings generatorReadings = generatorReadingsMapper.toEntity(dto);
        generatorReadingsRepository.save(generatorReadings);
    }
}
