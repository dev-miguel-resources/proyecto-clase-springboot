package cl.scd.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cl.scd.model.Usuario;

public interface ILoginRepo extends JpaRepository<Usuario, Integer> {
	
	//Consultas
	@Query("FROM Usuario us where us.username=:usuario")
	Usuario verificarNombreUsuario(@Param("usuario") String usuario) throws Exception;
	
	//Con query method
	//Usuario findOneByUsername(String usuario);
	
	@Transactional
	@Modifying
	@Query("UPDATE Usuario us SET us.password = :clave WHERE us.username=:nombre")
	void cambiarClave(@Param("clave") String clave, @Param("nombre") String nombre) throws Exception;
	

}
