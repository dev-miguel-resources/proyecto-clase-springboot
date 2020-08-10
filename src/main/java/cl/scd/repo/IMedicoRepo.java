package cl.scd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.scd.model.Medico;

//@Repository
public interface IMedicoRepo extends JpaRepository<Medico, Integer>{
	
}
