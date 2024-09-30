package com.example.joinTable.joinTableAlma.entidades;

import com.example.joinTable.joinTableAlma.enumeraciones.Titulos;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Profesor extends Persona{
    @NonNull
    private int cantHijos;


    private LocalDate fechaIngreso;

    @Column( name = "sueldo", precision = 10 , scale = 2)
    private BigDecimal sueldo;

    private Titulos titulo;
}
