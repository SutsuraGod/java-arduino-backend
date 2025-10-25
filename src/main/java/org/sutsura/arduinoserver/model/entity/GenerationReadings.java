package org.sutsura.arduinoserver.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "generator_readings")
public class GenerationReadings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "gasoline")
    private Integer gasoline;

    @Column(name = "generator_voltage")
    private Integer generatorVoltage;

    @Column(name = "network_voltage")
    private Integer networkVoltage;

    @Column(name = "time", insertable = false, updatable = false)
    private LocalDateTime time;
}
