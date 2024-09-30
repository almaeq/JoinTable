package com.example.joinTable.joinTableAlma.entidades;

import com.example.joinTable.joinTableAlma.enumeraciones.Especialidades;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@SuperBuilder

public class Alumno extends Persona {
        private int legajo;

        private Especialidades especialidad;
    }

