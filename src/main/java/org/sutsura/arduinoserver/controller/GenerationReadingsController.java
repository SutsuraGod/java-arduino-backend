package org.sutsura.arduinoserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.sutsura.arduinoserver.model.dto.GenerationReadingsDto;
import org.sutsura.arduinoserver.service.GeneratorReadingsService;

@RestController
public class GenerationReadingsController {

    @Autowired
    private GeneratorReadingsService generatorReadingsService;

    @PostMapping("/save_readings")
    public ResponseEntity<?>  saveReadings(@RequestBody GenerationReadingsDto dto) {
        generatorReadingsService.saveGeneratorReadings(dto);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
