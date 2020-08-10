package cl.scd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.scd.model.Examen;

//@Repository
public interface IExamenRepo extends JpaRepository<Examen, Integer>{
	
}
