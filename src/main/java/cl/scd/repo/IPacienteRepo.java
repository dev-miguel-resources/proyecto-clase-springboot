package cl.scd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.scd.model.Paciente;

//@Repository
public interface IPacienteRepo extends JpaRepository<Paciente, Integer>{
	
}
