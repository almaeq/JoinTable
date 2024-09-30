package com.example.joinTable.joinTableAlma.repositorios;

import com.example.joinTable.joinTableAlma.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository <Persona,Long> {
}
