package cl.scd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.scd.model.Menu;

public interface IMenuRepo extends JpaRepository<Menu, Integer> {
	
	//Falta consulta por realizar

}
