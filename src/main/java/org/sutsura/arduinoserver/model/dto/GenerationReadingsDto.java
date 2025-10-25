package org.sutsura.arduinoserver.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class GenerationReadingsDto {
    private Integer gasoline;
    private Integer generatorVoltage;
    private Integer networkVoltage;
    private LocalDateTime time;
}
