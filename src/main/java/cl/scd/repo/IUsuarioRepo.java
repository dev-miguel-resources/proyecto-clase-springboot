package cl.scd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.scd.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {
	
	
	// query method
	// select * from usuario where username = ?
	Usuario findOneByUsername(String username);

}
