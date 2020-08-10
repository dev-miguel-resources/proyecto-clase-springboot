package cl.scd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.scd.model.Especialidad;

//@Repository
public interface IEspecialidadRepo extends JpaRepository<Especialidad, Integer>{
	
}
