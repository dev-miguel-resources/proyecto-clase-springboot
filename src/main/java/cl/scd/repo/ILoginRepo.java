package cl.scd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.scd.model.Usuario;

public interface ILoginRepo extends JpaRepository<Usuario, Integer> {
	
	//Falta construir consultas

}
