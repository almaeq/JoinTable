package com.example.joinTable.joinTableAlma.repositorios;

import com.example.joinTable.joinTableAlma.entidades.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository <Alumno,Long> {
}
