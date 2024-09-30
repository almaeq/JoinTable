package com.example.joinTable.joinTableAlma.repositorios;

import com.example.joinTable.joinTableAlma.entidades.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository <Profesor,Long> {
}
