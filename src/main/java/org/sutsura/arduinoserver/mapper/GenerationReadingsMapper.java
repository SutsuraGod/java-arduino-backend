package org.sutsura.arduinoserver.mapper;

import org.mapstruct.Mapper;
import org.sutsura.arduinoserver.model.dto.GenerationReadingsDto;
import org.sutsura.arduinoserver.model.entity.GenerationReadings;

@Mapper(componentModel = "spring")
public interface GenerationReadingsMapper {

    GenerationReadingsDto toDto(GenerationReadings readings);

    GenerationReadings toEntity(GenerationReadingsDto dto);
}
