package com.example.joinTable.joinTableAlma;

import com.example.joinTable.joinTableAlma.entidades.Alumno;
import com.example.joinTable.joinTableAlma.entidades.Profesor;
import com.example.joinTable.joinTableAlma.enumeraciones.Especialidades;
import com.example.joinTable.joinTableAlma.enumeraciones.Titulos;
import com.example.joinTable.joinTableAlma.repositorios.AlumnoRepository;
import com.example.joinTable.joinTableAlma.repositorios.PersonaRepository;
import com.example.joinTable.joinTableAlma.repositorios.ProfesorRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class JoinTableAlmaApplication {

	private static final Logger logger = LoggerFactory.getLogger(JoinTableAlmaApplication.class);

	@Autowired
	private PersonaRepository personaRepository;
	@Autowired
	private ProfesorRepository profesorRepository;

	@Autowired
	private Alumno alumnoRepository;
	public static void main(String[] args) {
		SpringApplication.run(JoinTableAlmaApplication.class, args);

		System.out.println("funcionando");
	}




	@Bean
	@Transactional
	CommandLineRunner init(PersonaRepository personaRepository,
						   AlumnoRepository alumnoRepository,
						   ProfesorRepository profesorRepository) {
		return args -> {
			// Creo un objeto alumno
			Profesor pro1 = Profesor.builder()
					.nombre("Alberto")
					.apellido("Cortez")
					.fechaIngreso(LocalDate.of(2022, 1, 1))
					.cantHijos(2)
					.titulo(Titulos.MASTER)
					.sueldo(new BigDecimal("123.45"))
					.build();

			// Lo grabo a través del repositorio de Spring
			profesorRepository.save(pro1);

			Profesor pro2 = Profesor.builder()
					.nombre("Daniel")
					.nombre("Quinteros")
					.fechaIngreso(LocalDate.of(2022, 1, 1))
					.cantHijos(2)
					.titulo(Titulos.MASTER)
					.sueldo(new BigDecimal("123.45"))
					.build();


			// Lo grabo a través del repositorio de Spring
			profesorRepository.save(pro2);

			Alumno al1 = Alumno.builder()
					.nombre("Alma")
					.apellido("Quinteros")
					.legajo(62000)
					.especialidad(Especialidades.BACHILLER)
					.build();

			// Lo grabo a través del repositorio de Spring
			alumnoRepository.save(al1);

			Alumno al2 = Alumno.builder()
					.nombre("Lucas")
					.apellido("Crosta")
					.legajo(62001)
					.especialidad(Especialidades.BACHILLER)
					.build();

			// Lo grabo a través del repositorio de Spring
			alumnoRepository.save(al2);

			Alumno al3 = Alumno.builder()
					.nombre("Alan")
					.apellido("Turing")
					.legajo(1)
					.especialidad(Especialidades.BACHILLER)
					.build();

			// Lo grabo a través del repositorio de Spring
			alumnoRepository.save(al3);









		};

	};


}
